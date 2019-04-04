package com.baloise.qa.testautomation.gw.bc.rollesuperuserpruefen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.bc.rollen.Rollen;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class RolleSuperuserPruefenTest extends AGWBCTest {

  @Fill
  public Login login;
  
  public LinkesMenue linkesmenue;
  
  public Rollen rollen;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Test
  public void execute1() {
    execute();
  }

  public void execute() {
    logger.info("Starting test case");
    setFill("su_pruefen");

    login.fill();
    
    linkesmenue.selectRollen();
    
    rollen.checkRolleExists("Super User");
    
    werkzeugmenue.logout();
    
  }

}
