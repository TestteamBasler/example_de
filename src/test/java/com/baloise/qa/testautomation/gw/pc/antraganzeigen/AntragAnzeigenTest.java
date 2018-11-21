package com.baloise.qa.testautomation.gw.pc.antraganzeigen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.angebotansehen.AngebotAnsehen;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class AntragAnzeigenTest extends AGWPCTest {

  @Fill
  public Login login;
  
  @Fill
  public TopMenue topmenue;
  
  @Check
  public AngebotAnsehen angebot;
  
  public WerkzeugMenue werkzeugmenue;

  @Test
  public void execute() {
    logger.info("Starting test case");
    setFill("antraganzeigen");
    setCheck("antraganzeigen");
    login.fill();
    
    topmenue.fill();
    
    angebot.check();
    
    werkzeugmenue.logout();

    getGWDriver().close();

  }

}
