package com.baloise.qa.testautomation.gw.pc.neuerantrag;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.kontoinfoseingeben.KontoInfosEingeben;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.neueantraege.NeueAntraege;
import com.baloise.qa.testautomation.gw.components.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class NeuerAntragTest extends AGWPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;

  public NeueAntraege neueAntraege;
  
  @Fill
  public KontoInfosEingeben kontoInfos;

  public WerkzeugMenue werkzeugmenue;

  @Test
  public void execute() {
    logger.info("Starting test case");
    setFill("pcneu");
    login.fill();
    
    topmenue.selectMenueNeuerAntrag();
    
    neueAntraege.kontoSuchen();
    
    kontoInfos.fuellenUndSuchen();
    
    werkzeugmenue.logout();

    getGWDriver().close();

  }

}
