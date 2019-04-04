package com.baloise.qa.testautomation.gw.pc.neuerantrag;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.angebotansehen.AngebotAnsehen;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabenSFR.FahrzeugangabenSFR;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendeckung.FahrzeugangabenDeckung;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendetails.FahrzeugangabenDetails;
import com.baloise.qa.testautomation.gw.components.pc.jobcomplete.JobComplete;
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
public class NeuerAntragTest extends AGWPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;

  @Fill
  @Check
  public NeueAntraege neueAntraege;
  
  @Fill
  public KontoInfosEingeben kontoInfos;
  
  public LinkesMenue linkesmenue;
  
  @Fill
  @Check
  public PolicenInformationen policenInformationen;
  
  @Fill
  @Check
  public FahrzeugangabenDetails fahrzeugangabenDetails;
  
  @Fill
  public FahrzeugangabenDeckung fahrzeugDeckung;
  
  @Fill
  public FahrzeugangabenSFR fahrzeugSFR;
  
  public AngebotAnsehen angebot;
  
  @Check
  public JobComplete jobComplete;

  public WerkzeugMenue werkzeugmenue;

  @Test
  public void execute() {
    testexecution("pcneu");
  }
  
//  @Test
//  public void execute2() {
//    testexecution("pcneu2");
//  }
  
  public void testexecution(String testid) {
    
    logger.info("Starting test case " + testid);
    setFill(testid);
    setCheck(testid);
    
    login.fill();
    
    topmenue.selectMenueNeuerAntrag();
    neueAntraege.kontoSuchen();
    kontoInfos.fuellenUndSuchen();
    neueAntraege.kontoWaehlen();
    
    linkesmenue.selectNewSubmission();
    
    neueAntraege.check();
    neueAntraege.checkProduktExists("Kraftfahrtversicherung");
    neueAntraege.fill();
    neueAntraege.selectKfzVersicherung();
    
    policenInformationen.policefuellenundkontrolieren();
    
    fahrzeugangabenDetails.fahrzeugangabenfuellenundkontrollieren();
    fahrzeugDeckung.deckungenfuellen();
    fahrzeugSFR.fuellenUndAngebot();
    
    angebot.policeausstellen();
    
    jobComplete.check();
    
    //werkzeugmenue.logout();

  }

}