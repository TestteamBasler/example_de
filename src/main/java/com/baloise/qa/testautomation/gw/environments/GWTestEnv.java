package com.baloise.qa.testautomation.gw.environments;

import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWEnvironment;

import com.baloise.testautomation.taf.base.types.TafId;

public class GWTestEnv implements IGWEnvironment {

  @Override
  public String getUrlPart() {
    return "test-";
  }

  @Override
  public void setTafGlobalMandant() {
    TafId.SetGlobalMandant("test");
  }

}
