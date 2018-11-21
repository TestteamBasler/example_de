package com.baloise.qa.testautomation.gw.browsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEBrowser extends ABrowser {

  private static final String IEDRIVERSERVER = "IEDriverServer.exe";

  @Override
  public WebDriver getNewDriver() {
    // Single Sign Off ausschalten
    runCommand(
        "REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" /v EnableNegotiate /t REG_DWORD /d 0x0 /f");

    // alle IE-Zones --> Protected Mode einschalten
    // runCommand("REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\\Zones\\0\" /v 2500
    // /t REG_DWORD /d 0x0 /f");
    runCommand(
        "REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\\Zones\\1\" /v 2500 /t REG_DWORD /d 0x0 /f");
    runCommand(
        "REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\\Zones\\2\" /v 2500 /t REG_DWORD /d 0x0 /f");
    runCommand(
        "REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\\Zones\\3\" /v 2500 /t REG_DWORD /d 0x0 /f");
    runCommand(
        "REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\\Zones\\4\" /v 2500 /t REG_DWORD /d 0x0 /f");

    System.setProperty("webdriver.ie.driver", IGWBrowser.getPath(IEDRIVERSERVER));
    DesiredCapabilities dc = new DesiredCapabilities();
    dc.setCapability(CapabilityType.OVERLAPPING_CHECK_DISABLED, true);

    InternetExplorerOptions ieo = new InternetExplorerOptions();
    ieo.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, 1);

    WebDriver driver = null;
    List<String> runningIExplorerIDs = getRunningIExplorerIDs();
    try {
      driver = new InternetExplorerDriver(ieo);
    }
    catch (Throwable t) {
      for (String id : getRunningIExplorerIDs()) {
        if (!runningIExplorerIDs.contains(id)) {
          try {
            Runtime.getRuntime().exec("taskkill /F /PID " + id);
          }
          catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
      killDriver();
      throw t;
    }
    driver.manage().timeouts().implicitlyWait(new Double(20 * 1000).longValue(), TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();
    return driver;
  }

  public List<String> getRunningIExplorerIDs() {
    List<String> processes = new ArrayList<String>();
    try {
      String line;
      Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
      BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
      while ((line = input.readLine()) != null) {
        if (!line.trim().isEmpty()) {
          String[] elements = line.split(",");
          if ("\"iexplore.exe\"".equalsIgnoreCase(elements[0])) {
            processes.add(elements[1].replace("\"", ""));
          }
        }
      }
      input.close();
    }
    catch (Exception err) {
      err.printStackTrace();
    }
    return processes;
  }

  @Override
  public void killDriver() {
    System.out.println("Will 'taskkill' running IEDriverServer(s): " + IEDRIVERSERVER);
    try {
      Runtime.getRuntime().exec("taskkill /F /IM " + IEDRIVERSERVER);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void runCommand(String cmd) {
    try {
      Process p = Runtime.getRuntime().exec(cmd);
      p.waitFor();
      p.destroy();
    }
    catch (IOException | InterruptedException e) {
      System.out.println("ERROR.RUNNING.CMD: " + cmd);
    }
  }
}
