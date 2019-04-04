package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWCC implements IGWApplication {

  public String getRoot() {
    return "/cc/ClaimCenter.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    //return "http://18.184.194.1/cc";
	//return "http://ec2-3-120-32-27.eu-central-1.compute.amazonaws.com/cc";
	return "http://ec2-3-121-159-91.eu-central-1.compute.amazonaws.com/cc";
  }

}