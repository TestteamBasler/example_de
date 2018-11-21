package com.baloise.qa.testautomation.gw.browsers;

import java.util.concurrent.TimeUnit;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GCBrowser extends ABrowser {

  private static final String CHROMEDRIVER = "chromedriver.exe";

  @Override
  public WebDriver getNewDriver() {
    System.setProperty("webdriver.chrome.driver", IGWBrowser.getPath(CHROMEDRIVER));
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--touch-events=disabled");
    WebDriver driver = new ChromeDriver(co);
    driver.manage().timeouts().implicitlyWait(new Double(20 * 1000).longValue(), TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();
    return driver;
  }

  @Override
  public void killDriver() {
    System.out.println("Will 'taskkill' running chromedriver(s): " + CHROMEDRIVER);
    try {
      Runtime.getRuntime().exec("taskkill /F /IM " + CHROMEDRIVER);
      Thread.sleep(1000);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}
