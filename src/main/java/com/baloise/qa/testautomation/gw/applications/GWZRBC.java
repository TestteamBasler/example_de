package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWZRBC implements IGWApplication {

  public String getRoot() {
    return "/bc/BillingCenter.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    return "http://ec2-3-121-196-27.eu-central-1.compute.amazonaws.com/bc";
  }

}
