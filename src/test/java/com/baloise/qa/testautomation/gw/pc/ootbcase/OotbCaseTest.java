package com.baloise.qa.testautomation.gw.pc.ootbcase;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.fahrzeugangaben.Fahrzeugangaben;
import com.baloise.qa.testautomation.gw.components.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.neueantraege.NeueAntraege;
import com.baloise.qa.testautomation.gw.components.policeninformationen.PolicenInformationen;
import com.baloise.qa.testautomation.gw.components.sfreingeben.SfrEingeben;
import com.baloise.qa.testautomation.gw.components.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.fahrzeugsuchen.FahrzeugSuchen;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class OotbCaseTest extends AGWPCTest {

  @Fill
  public Login login;
  
  @Fill
  public TopMenue topmenue;
  
  public LinkesMenue linkesmenue;
  
  public NeueAntraege neuerantrag;
  
  @Fill
  public PolicenInformationen policeninformationen;
  
  @Fill
  @Check
  public Fahrzeugangaben fahrzeugangaben;
  
  @Fill
  public FahrzeugSuchen fahrzeugsuchen;
  
  @Fill
  public SfrEingeben sfreingeben;
  
  @Test
  public void execute() {
    logger.info("Starting test case");
    setFill("ootb");
    setCheck("ootb");
    
    login.fill();
    
    topmenue.fill();
    
    linkesmenue.selectAktionen();
    linkesmenue.selectNewSubmission();
    
    neuerantrag.newPrivatFahrzeug();    
    
    policeninformationen.policefuellen();
    
    fahrzeugangaben.fahrzeugangabenfuellen();
    fahrzeugsuchen.fahrzeugdetailsfuellen();
    fahrzeugangaben.fahrzeugangabendeckungenfuellen();
    fahrzeugangaben.evbanfordern();
    fahrzeugangaben.sfrhaftpflichtfuellen();
    //sfreingeben.sfrfuellen();
    //fahrzeugangaben.sfrkaskofuellen();
    //sfreingeben.sfrfuellen();
    

  }

}
