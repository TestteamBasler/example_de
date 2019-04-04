package com.baloise.qa.testautomation.gw.pc.ootbcase;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.angebotansehen.AngebotAnsehen;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendeckung.FahrzeugangabenDeckung;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendetails.FahrzeugangabenDetails;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugsuchen.FahrzeugSuchen;
import com.baloise.qa.testautomation.gw.components.pc.jobcomplete.JobComplete;
import com.baloise.qa.testautomation.gw.components.pc.kontoinfoseingeben.KontoInfosEingeben;
import com.baloise.qa.testautomation.gw.components.pc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.pc.neueantraege.NeueAntraege;
import com.baloise.qa.testautomation.gw.components.pc.policeninformationen.PolicenInformationen;
import com.baloise.qa.testautomation.gw.components.pc.risikoanalyse.Risikoanalyse;
import com.baloise.qa.testautomation.gw.components.pc.sfreingeben.SfrEingeben;
import com.baloise.qa.testautomation.gw.components.pc.sfrhaftpflicht.SFRHaftpflich;
import com.baloise.qa.testautomation.gw.components.pc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class OotbCaseTest extends AGWPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  public LinkesMenue linkesmenue;
  
  public NeueAntraege neueAntraege;
  
  @Fill
  public KontoInfosEingeben kontoInfos;
  
  @Fill
  public PolicenInformationen policenInformationen;
  
  @Fill
  @Check
  public FahrzeugangabenDetails fahrzeugangabenDetails;
  
  //@Fill
  //public FahrzeugSuchen fahrzeugsuchen;
  
  public SFRHaftpflich haftpflicht;
  
  @Fill
  public FahrzeugangabenDeckung fahrzeugDeckung;
  
  //public Risikoanalyse risikoanalyse;
  
  @Check
  public AngebotAnsehen angebot;
  
  @Check
  public JobComplete jobComplete;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Test
  public void execute() {
    //Spielwiese fur trainieren Test Testcase
    logger.info("Starting test case");
    setFill("ootb");
    setCheck("ootb");
    
    login.fill();
    
    werkzeugmenue.setToDeutsch();
    
    topmenue.selectMenueNeuerAntrag();
    neueAntraege.kontoSuchen();
    kontoInfos.fuellenUndSuchen();
    neueAntraege.kontoWaehlen();
    
    linkesmenue.selectNewSubmission();
    
    //neueAntraege.checkProduktExists("Kraftfahrtversicherung");
    neueAntraege.selectKfzVersicherung();
    
    policenInformationen.policefuellen();
    
    //fahrzeugsuchen.fahrzeugdetailsfuellen();
    fahrzeugangabenDetails.minimumfahrzeugangabenfuellen();
    //fahrzeugangabenDetails.selectSfrHaftpflicht();
    //haftpflicht.jahrAuswahlUndOK("2018");
    //fahrzeugangabenDetails.selectSfrKasko();
    
    //fahrzeugDeckung.füllenUndAngebot();
    
    //risikoanalyse.angebot.click();
    
    //angebot.policeausstellen();
    
    //jobComplete.check();

  }

}
