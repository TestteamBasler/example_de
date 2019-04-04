package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWCM implements IGWApplication {

  public String getRoot() {
    return "/ab/ContactManager.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    //return "http://18.184.194.1/bc";
    //return "http://ec2-52-59-193-174.eu-central-1.compute.amazonaws.com/bc";
    return "http://ec2-3-121-159-91.eu-central-1.compute.amazonaws.com/ab";
  }

}
