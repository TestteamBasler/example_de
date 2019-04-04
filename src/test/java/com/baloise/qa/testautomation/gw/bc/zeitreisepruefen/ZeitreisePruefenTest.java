package com.baloise.qa.testautomation.gw.bc.zeitreisepruefen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.rechnungsuchen.RechnungSuchen;
import com.baloise.qa.testautomation.gw.components.bc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.bc.zeitreise.Zeitreise;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWZRBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class ZeitreisePruefenTest extends AGWZRBCTest {

  @Fill
  public Login login;
  
  @Fill
  public Zeitreise zeitreise;
 
  public TopMenue topmenue;
  
  @Fill
  @Check
  public RechnungSuchen rechnungsuche;
  
  public WerkzeugMenue werkzeugmenue;
  
  /*@Test
  public void execute1() {
    execute("quartal4");
  }*/

  @Test
  public void execute2() {
    execute("quartal1");
  }

  public void execute(String sdata) {
    logger.info("Starting test case");
    setFill(sdata);
    setCheck(sdata);

    login.fill();
    
    zeitreise.fill();
    
    topmenue.selectSuchenRechnung();
    
    rechnungsuche.fill();
    rechnungsuche.check();
    
    werkzeugmenue.logoutAndCheck();
    
  }

}
