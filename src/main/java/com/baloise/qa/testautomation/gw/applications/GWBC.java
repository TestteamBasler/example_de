package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWBC implements IGWApplication {

  public String getRoot() {
    return "/bc/BillingCenter.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    return "http://18.184.194.1/bc";
  }

}
