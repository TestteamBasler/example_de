package com.baloise.qa.testautomation.gw.browsers;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FFBrowser extends ABrowser {

  String geckoDriver = "geckodriver_0_23_0.exe";

  @Override
  public WebDriver getNewDriver() {
    FirefoxProfile profile = new FirefoxProfile();
    profile.setPreference("dom.w3c_touch_events.enabled", 0);
    FirefoxOptions ffo;

    DesiredCapabilities dc = new DesiredCapabilities();
    dc.setCapability(CapabilityType.OVERLAPPING_CHECK_DISABLED, true);
    dc.setCapability(CapabilityType.HAS_NATIVE_EVENTS, true);

    WebDriver driver;

    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

    //System.setProperty("selenium.firefox.path", "C:\\Program Files (x86)\\Mozilla Firefox 3.14.0\\firefox.exe");
    System.setProperty("selenium.firefox.path", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
    System.setProperty("webdriver.gecko.driver", IGWBrowser.getPath(geckoDriver));

    if (System.getProperty("selenium.firefox.path") != null) {
      File pathBinary = new File(System.getProperty("selenium.firefox.path"));
      FirefoxBinary binary = new FirefoxBinary(pathBinary);
      // binary.addCommandLineOptions("--headless");
      ffo = new FirefoxOptions().setBinary(binary).setProfile(profile).merge(dc);
    }
    else {
      ffo = new FirefoxOptions().setProfile(profile).merge(dc);
    }

    driver = new FirefoxDriver(ffo);
    driver.manage().timeouts().implicitlyWait(new Double(20 * 1000).longValue(), TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();

    return driver;
  }

  @Override
  public void killDriver() {
    System.out.println("Will 'taskkill' running geckodriver(s): " + geckoDriver);
    try {
      Runtime.getRuntime().exec("taskkill /F /IM " + geckoDriver);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}
