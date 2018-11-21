package com.baloise.qa.testautomation.gw.browsers;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWBrowser;
import org.openqa.selenium.WebDriver;

public abstract class ABrowser implements IGWBrowser {

  private WebDriver driver = null;

  @Override
  public WebDriver getDriver() {
    if (driver == null) {
      driver = getNewDriver();
    }
    return driver;
  }

  protected abstract WebDriver getNewDriver();

}
