package com.baloise.qa.testautomation.gw.environments;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWEnvironment;

import com.baloise.testautomation.taf.base.types.TafId;

public class GWLocalEnv implements IGWEnvironment {

  @Override
  public String getUrlPart() {
    return "";
  }

  @Override
  public void setTafGlobalMandant() {
    TafId.SetGlobalMandant("local");
  }

}
