package com.baloise.qa.testautomation.gw.cc.vorbereitungbenutzeranlage;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.cc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.cc.benutzergrundlagen.BenutzerGrundlagen;
import com.baloise.qa.testautomation.gw.components.cc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.cc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.cc.AGWCCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class VorbereitungBenutzeranlageTest extends AGWCCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  public LinkesMenue linkesmenue;
  
  @Fill
  public BenutzerGrundlagen grundlagen;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Test
  public void execute1() {
	execute("useranlage1");
  }

  /*@Test
  public void execute2() {
	execute("useranlage2");
  }*/

  public void execute(String sdata) {
    logger.info("Starting test case");
    setFill(sdata);

    login.fill();
    
    werkzeugmenue.setToDeutsch();
    
    topmenue.selectVerwaltungPage();
    
    linkesmenue.selectNewUser();
    
    grundlagen.fuellenMitRollenGruppenUndAnlegen("Superuser", "Basler");
        
    werkzeugmenue.logoutAndCheck();
    
  }

}
