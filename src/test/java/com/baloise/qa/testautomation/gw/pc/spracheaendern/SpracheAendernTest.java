package com.baloise.qa.testautomation.gw.pc.spracheaendern;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class SpracheAendernTest extends AGWPCTest {

  @Fill
  public Login login;
  
  public WerkzeugMenue werkzeugmenue;

  @Test
  public void execute() {
    logger.info("Starting test case");
    setFill("sudeutsch");
    
//    login.fill();
//    werkzeugmenue.setToEnglisch();
//    werkzeugmenue.logout();
    
    login.fill();
    werkzeugmenue.setToDeutsch();
    //werkzeugmenue.logout();

  }

}
