package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWPCSOR implements IGWApplication {

  public String getRoot() {
    return "/pc/PolicyCenter.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    //return "http://18.184.194.1/pc";
    //return "http://ec2-18-185-52-123.eu-central-1.compute.amazonaws.com/pc";
    return "http://ec2-3-121-159-91.eu-central-1.compute.amazonaws.com/pc";
  }

}
