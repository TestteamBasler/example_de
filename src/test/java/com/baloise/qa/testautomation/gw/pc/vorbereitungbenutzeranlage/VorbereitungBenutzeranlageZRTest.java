package com.baloise.qa.testautomation.gw.pc.vorbereitungbenutzeranlage;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.benutzergrundlagen.BenutzerGrundlagen;
import com.baloise.qa.testautomation.gw.components.pc.benutzerprofil.BenutzerProfil;
import com.baloise.qa.testautomation.gw.components.pc.benutzerrollen.BenutzerRollen;
import com.baloise.qa.testautomation.gw.components.pc.benutzeruwberechtigungen.BenutzerUWBerechtigungen;
import com.baloise.qa.testautomation.gw.components.pc.benutzerzugriff.BenutzerZugriff;
import com.baloise.qa.testautomation.gw.components.pc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.pc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWZRPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class VorbereitungBenutzeranlageZRTest extends AGWZRPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  public LinkesMenue linkesmenue;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Fill
  public BenutzerGrundlagen grundlagen;
  
  @Fill
  public BenutzerZugriff zugriff;
  
  @Fill
  public BenutzerRollen rollen;
  
  @Fill
  public BenutzerProfil profil;
  
  @Fill
  public BenutzerUWBerechtigungen uwrechte;
  
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
    
    grundlagen.fuellen();
    
    zugriff.fuellen();
    
    rollen.fuellen();
    
    profil.fuellen();
    
    uwrechte.fuellenUndAnlegen();
    
    werkzeugmenue.logout();
    
  }

}
