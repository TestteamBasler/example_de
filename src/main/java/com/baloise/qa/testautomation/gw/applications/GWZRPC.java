package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWZRPC implements IGWApplication {

  public String getRoot() {
    return "/pc/PolicyCenter.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    return "http://ec2-3-121-196-27.eu-central-1.compute.amazonaws.com/pc";
  }

}
