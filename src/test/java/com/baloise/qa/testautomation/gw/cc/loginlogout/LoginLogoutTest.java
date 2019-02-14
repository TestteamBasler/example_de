package com.baloise.qa.testautomation.gw.cc.loginlogout;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.cc.AGWCCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class LoginLogoutTest extends AGWCCTest {

  @Fill
  public Login login;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Test
  public void execute1() {
    execute("loginlogout1");
  }

/*  @Test
  public void execute2() {
    execute("loginlogout2");
    getGWDriver().close();
  }*/

  public void execute(String fillid) {
    logger.info("Starting test case");
    setFill(fillid);

    login.fill();
    
    werkzeugmenue.logout();
    
    getGWDriver().close();
  }

}
