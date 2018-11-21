package com.baloise.qa.testautomation.gw.base;

import java.lang.annotation.Annotation;

import org.junit.Assert;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication.Application;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWBrowser.Browser;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWEnvironment.Environment;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWLocale.Locale;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWStack.Stack;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

import com.baloise.testautomation.taf.base._base.AnnotationHelper;

public class GWTestcaseWatcher extends TestWatcher {

  private GWClassWatcher classWatcher;

  public GWTestcaseWatcher(GWClassWatcher classWatcher) {
    this.classWatcher = classWatcher;
  }

  @Override
  protected void finished(Description description) {
    getManager().stopApplication();
  }

  private <T extends Annotation> T getAnnotation(Description description, Class<T> klass) {
    // method level
    T annotation = description.getAnnotation(klass);
    if (annotation == null) {
      annotation = AnnotationHelper.getAnnotationInHierarchy(description.getTestClass(), klass);
    }
    return annotation;
  }

  public IGWTestcaseManager getManager() {
    return classWatcher.getManager();
  }

  public void init(Description description) {
    Assert.assertNotNull("To start a test, either class or test-method must be annotated with @getManager()",
        getManager());

    getManager().reset();
    
    Application application = getAnnotation(description, Application.class);
    if (application != null) {
      try {
        getManager().setApplication(application.value().newInstance());
      }
      catch (Exception e) {}
    }

    Browser browser = getAnnotation(description, Browser.class);
    if (browser != null) {
      try {
        getManager().setBrowser(browser.value().newInstance());
      }
      catch (Exception e) {}
    }

    Environment environment = getAnnotation(description, Environment.class);
    if (environment != null) {
      try {
        getManager().setEnvironment(environment.value().newInstance());
      }
      catch (Exception e) {}
    }

    Stack stack = getAnnotation(description, Stack.class);
    if (stack != null) {
      try {
        getManager().setStack(stack.value().newInstance());
      }
      catch (Exception e) {}
    }

    Locale locale = getAnnotation(description, Locale.class);
    if (locale != null) {
      try {
        getManager().setLocale(locale.value().newInstance());
      }
      catch (Exception e) {}
    }

  }

  @Override
  protected void starting(Description description) {
    init(description);
    getManager().startApplication();
  }

}
