package com.baloise.qa.testautomation.gw.cc.neuerschadensfall;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.cc.allgemeineinformationen.AllgemeineInformationen;
import com.baloise.qa.testautomation.gw.components.cc.dienste.Dienste;
import com.baloise.qa.testautomation.gw.components.cc.schadensdetails.Schadensdetails;
import com.baloise.qa.testautomation.gw.components.cc.schadensfallspeichern.SchadensfallSpeichern;
import com.baloise.qa.testautomation.gw.components.cc_policesuchen.PoliceSuchen;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.cc.AGWCCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class NeuerSchadensfallTest extends AGWCCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  @Fill
  public PoliceSuchen policesuchen;
  
  @Fill
  public AllgemeineInformationen allgemeineinformationen;
  
  @Fill
  public Schadensdetails schadensdetails;
  
  public Dienste dienste;
  
  public SchadensfallSpeichern schadensfallspeichern;
  
  @Test
  public void execute() {
    logger.info("Starting test case");
    setFill("ccneu");
    
    login.fill();
    
    topmenue.selectMenueNeuerSchadensfall();
    
    policesuchen.policesuchefuellen();
    
    allgemeineinformationen.allgemeineinformationenfuellen();
    
    schadensdetails.schadensdetailsfuellen();
    
    dienste.weiter.click();
    
    schadensfallspeichern.fertigstellen.click();

  }

}
