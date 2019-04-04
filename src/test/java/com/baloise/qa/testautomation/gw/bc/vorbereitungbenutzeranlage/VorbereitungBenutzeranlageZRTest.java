package com.baloise.qa.testautomation.gw.bc.vorbereitungbenutzeranlage;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.bc.benutzerbasis.BenutzerBasis;
import com.baloise.qa.testautomation.gw.components.bc.benutzerprofil.BenutzerProfil;
import com.baloise.qa.testautomation.gw.components.bc.benutzervollmachtsrahmen.BenutzerVollmachtsrahmen;
import com.baloise.qa.testautomation.gw.components.bc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWZRBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class VorbereitungBenutzeranlageZRTest extends AGWZRBCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  public LinkesMenue linkesmenue;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Fill
  public BenutzerBasis basis;
  
  @Fill
  public BenutzerProfil profil;
  
  public BenutzerVollmachtsrahmen vollmachtsrahmen;
  
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
    
    basis.fuellenMitRollenUndWeiter("Super User");
    
    profil.fuellenUndWeiter();
    
    vollmachtsrahmen.selectFertig();
        
    werkzeugmenue.logoutAndCheck();
    
  }

}
