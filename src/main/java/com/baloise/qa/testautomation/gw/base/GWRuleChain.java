package com.baloise.qa.testautomation.gw.base;

import org.junit.rules.RuleChain;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

import com.baloise.testautomation.taf.base.testing.ScreenshotOnFailed;
import com.baloise.testautomation.taf.base.testing.ScreenshotRule;

public class GWRuleChain {

  private GWMethodWatcher methodWatcher;
  private GWTestcaseWatcher gwTestcaseWatcher;
  private ScreenshotRule ssof;

  public GWRuleChain(GWClassWatcher classWatcher) {
    methodWatcher = new GWMethodWatcher(classWatcher);
    gwTestcaseWatcher = new GWTestcaseWatcher(classWatcher);
    ssof = new ScreenshotOnFailed("target\\").withClassName();
  }

  public IGWTestcaseManager getManager() {
    return gwTestcaseWatcher.getManager();
  }

  public RuleChain getRules() {
    return RuleChain.outerRule(methodWatcher).around(gwTestcaseWatcher).around(ssof);
  }

}
