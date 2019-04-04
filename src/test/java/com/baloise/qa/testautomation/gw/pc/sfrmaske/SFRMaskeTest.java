package com.baloise.qa.testautomation.gw.pc.sfrmaske;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
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
  
  public WerkzeugMenue werkzeugmenue;

  @Test
  public void execute1() {
    testexecution("sfr1");
  }
  
//  @Test
//  public void execute2() {
//    testexecution("sfr2");
//  }
  
  public void testexecution(String testid) {
    
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
    
    fahrzeugangabenDetails.SFRplausikontrolle();
   
    //werkzeugmenue.logoutAndCheck();

  }

}