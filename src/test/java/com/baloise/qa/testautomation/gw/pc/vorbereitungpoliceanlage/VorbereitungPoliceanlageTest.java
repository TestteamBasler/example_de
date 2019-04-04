package com.baloise.qa.testautomation.gw.pc.vorbereitungpoliceanlage;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.angebotansehen.AngebotAnsehen;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendeckung.FahrzeugangabenDeckung;
import com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendetails.FahrzeugangabenDetails;
import com.baloise.qa.testautomation.gw.components.pc.kontoinfoseingeben.KontoInfosEingeben;
import com.baloise.qa.testautomation.gw.components.pc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.pc.neueantraege.NeueAntraege;
import com.baloise.qa.testautomation.gw.components.pc.policeninformationen.PolicenInformationen;
import com.baloise.qa.testautomation.gw.components.pc.sfrhaftpflicht.SFRHaftpflich;
import com.baloise.qa.testautomation.gw.components.pc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class VorbereitungPoliceanlageTest extends AGWPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  public NeueAntraege neueAntraege;
  
  @Fill
  public KontoInfosEingeben kontoinfoseingeben;
  
  public LinkesMenue linkesmenue;
  
  public NeueAntraege neueantraege;
  
  @Fill
  public PolicenInformationen policeninfos;
  
  @Fill
  public FahrzeugangabenDetails fahrzeugangaben;
  
  public SFRHaftpflich haftpflicht;
  
  @Fill
  public FahrzeugangabenDeckung fahrzeugdeckung;
  
  public AngebotAnsehen angebot;

  public WerkzeugMenue werkzeugmenue;
    
  /*@Test
  public void execute1() {
	execute("kfzpolice1");
  }*/

  @Test
  public void execute2() {
	execute("kfzpolice2");
  }

  /*@Test
  public void execute3() {
	execute("kfzpolice3");
  }*/

  public void execute(String sdate) {
    logger.info("Starting test case");
    setFill(sdate);

    login.fill();
    
    werkzeugmenue.setToDeutsch();
    
    topmenue.selectMenueNeuerAntrag();
    neueAntraege.kontoSuchen();
    kontoinfoseingeben.fuellenUndSuchen();
    neueAntraege.kontoWaehlen();
    
    linkesmenue.selectNewSubmission();
    
    neueantraege.selectKfzVersicherung();
    
    policeninfos.policefuellen();
    
    //fahrzeugangaben.evbanfordern();
    
    fahrzeugangaben.minimumfahrzeugangabenfuellen();
    
    //fahrzeugangaben.selectSfrHaftpflicht();
    
    //haftpflicht.jahrAuswahlUndOK("2018");
    
    //fahrzeugangaben.selectSfrKasko();
    
    fahrzeugdeckung.füllenUndAngebot();
    
    angebot.policeausstellen();

    werkzeugmenue.logoutAndCheck();
    
  }

}
