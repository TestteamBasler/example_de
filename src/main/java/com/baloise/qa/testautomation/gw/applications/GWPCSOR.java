package com.baloise.qa.testautomation.gw.applications;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWApplication;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;

public class GWPCSOR implements IGWApplication {

  public String getRoot() {
    return "/pc/PolicyCenter.do?lang={locale}";
  }

  @Override
  public String getUrl(IGWTestcaseManager manager) {
    return "http://18.184.194.1/pc";
  }

}
