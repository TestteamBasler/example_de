package com.baloise.qa.testautomation.gw.pc.sfrmaske;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabenSFR.FahrzeugangabenSFR;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendetails.FahrzeugangabenDetails;
import com.baloise.qa.testautomation.gw.components.pc.kontoinfoseingeben.KontoInfosEingeben;
import com.baloise.qa.testautomation.gw.components.pc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.pc.neueantraege.NeueAntraege;
import com.baloise.qa.testautomation.gw.components.pc.policeninformationen.PolicenInformationen;
import com.baloise.qa.testautomation.gw.components.pc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class SFRMaskeTest extends AGWPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;

  public NeueAntraege neueAntraege;
  
  @Fill
  public KontoInfosEingeben kontoInfos;
  
  public LinkesMenue linkesmenue;
  
  @Fill
  public PolicenInformationen policenInformationen;
  
  @Fill
  public FahrzeugangabenDetails fahrzeugangabenDetails;
  
  @Fill
  @Check
  public FahrzeugangabenSFR fahrzeugSFR;
  
  public WerkzeugMenue werkzeugmenue;

  @Test
  public void execute1() {
    testexecution1("sfr1");
  }
  
  @Test
  public void execute2() {
    testexecution2("sfr2");
  }
  
  @Test
  public void execute3() {
    testexecution2("sfr3");
  }
  
  @Test
  public void execute4() {
    testexecution2("sfr4");
  }

  @Test
  public void execute5() {
    testexecution2("sfr5");
  }

  @Test
  public void execute6() {
    testexecution2("sfr6");
  }
  
  
  public void testexecution1(String testid) {
    
    logger.info("Starting test case " + testid);
    setFill(testid);
    //setCheck(testid);
    
    login.fill();
    
    werkzeugmenue.setToDeutsch();
    
    topmenue.selectMenueNeuerAntrag();
    neueAntraege.kontoSuchen();
    kontoInfos.fuellenUndSuchen();
    neueAntraege.kontoWaehlen();
    
    linkesmenue.selectNewSubmission();
    
    neueAntraege.checkProduktExists("Kraftfahrtversicherung");
    neueAntraege.selectKfzVersicherung();
    
    policenInformationen.policefuellen();
    
    fahrzeugangabenDetails.SFRplausikontrolle();
   
    werkzeugmenue.logoutAndCheck();
    //getGWDriver().close();

  }
  
  public void testexecution2(String testid) {
    
    logger.info("Starting test case " + testid);
    setFill(testid);
    setCheck(testid);
    
    login.fill();
    
    werkzeugmenue.setToDeutsch();
    
    topmenue.selectMenueNeuerAntrag();
    neueAntraege.kontoSuchen();
    kontoInfos.fuellenUndSuchen();
    neueAntraege.kontoWaehlen();
    
    linkesmenue.selectNewSubmission();
    
    neueAntraege.checkProduktExists("Kraftfahrtversicherung");
    neueAntraege.selectKfzVersicherung();
    
    policenInformationen.policefuellen();
    
    fahrzeugangabenDetails.fahrzeugangabenfuellen();
    fahrzeugSFR.SFRfuellenundpruefen();
   
    werkzeugmenue.logoutAndCheck();
    //getGWDriver().close();

  }

}