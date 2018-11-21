package com.baloise.qa.testautomation.gw.base;

import org.junit.Assert;
import org.open.insurance.baloise.qa.ui.taf.gw.finder.GWBrFinder;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWBrowser;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWEnvironment;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWLocale;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWStack;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;
import org.openqa.selenium.WebDriver;

import com.baloise.qa.testautomation.gw.browsers.FFBrowser;
import com.baloise.qa.testautomation.gw.environments.GWIntEnv;
import com.baloise.qa.testautomation.gw.environments.GWTestEnv;
import com.baloise.qa.testautomation.gw.locales.GWDELocale;
import com.baloise.qa.testautomation.gw.stacks.GWStandardStack;

public class GWTestcaseManager implements IGWTestcaseManager {

  WebDriver driver = null;

  IGWApplication application = null;
  IGWBrowser browser = null;
  IGWEnvironment environment = null;
  IGWStack stack = null;
  IGWLocale locale = null;

  GWBrFinder gwFinder = null;

  boolean debug = true;

  @Override
  public IGWApplication getApplication() {
    return application;
  }

  @Override
  public IGWBrowser getBrowser() {
    return browser;
  }

  @Override
  public IGWEnvironment getEnvironment() {
    return environment;
  }

  public GWBrFinder getGWFinder() {
    return gwFinder;
  }

  @Override
  public IGWLocale getLocale() {
    return locale;
  }

  @Override
  public IGWStack getStack() {
    return stack;
  }

  private void initDebug() {
    environment = new GWTestEnv();
    stack = new GWStandardStack();
    locale = new GWDELocale();
  }

  private boolean isDebug() {
    return debug;
  }

  public void setApplication(IGWApplication application) {
    this.application = application;
  }

  public void setBrowser(IGWBrowser browser) {
    this.browser = browser;
  }

  public void setEnvironment(IGWEnvironment environment) {
    this.environment = environment;
  }

  @Override
  public void setLocale(IGWLocale locale) {
    this.locale = locale;
  }

  @Override
  public void setStack(IGWStack stack) {
    this.stack = stack;
  }

  public void startApplication() {
    if (isDebug()) {
      initDebug();
    }
    if (browser == null) {
      browser = new FFBrowser();
    }
    if (environment == null) {
      environment = new GWIntEnv();
    }
    environment.setTafGlobalMandant();
    if (stack == null) {
      stack = new GWStandardStack();
    }
    if (locale == null) {
      locale = new GWDELocale();
    }
    Assert.assertNotNull("@Application fehlt --> entweder auf Klassen- oder Methodenebene hinzufügen", application);
    driver = browser.getDriver();
    gwFinder = new GWBrFinder(driver, 30);
    String url = application.getUrl(this);
    System.out.println("Starten mit: " + url);
    driver.get(url);
  }

  public void stopApplication() {
    if (!isDebug()) {
      driver.quit();
    }
    else {
      browser.killDriver();
    }
  }

  @Override
  public void reset() {
    setApplication(null);
    setBrowser(null);
    setEnvironment(null);
    setLocale(null);
    setStack(null);
  }

}
