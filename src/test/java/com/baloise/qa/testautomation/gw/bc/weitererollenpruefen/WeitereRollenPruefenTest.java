package com.baloise.qa.testautomation.gw.bc.weitererollenpruefen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.bc.rollen.Rollen;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class WeitereRollenPruefenTest extends AGWBCTest {

	@Fill
	  public Login login;
	  
	  public LinkesMenue linkesmenue;
	  
	  public Rollen rollen;
	  
	  public WerkzeugMenue werkzeugmenue;
	  
	  @Test
	  public void execute1() {
	    execute();
	  }

	  public void execute() {
	    logger.info("Starting test case");
	    setFill("su_pruefen");

	    login.fill();
	    
	    linkesmenue.selectRollen();
	    
	    rollen.checkRolleExists("Sachbearbeiter Kundenbuchhaltung");
	    rollen.checkRolleExists("Teamleiter Kundenbuchhaltung");
	    rollen.checkRolleExists("Sachbearbeiter Vermittlerbuchhaltung");
	    rollen.checkRolleExists("Teamleiter Vermittlerbuchhaltung");
	    rollen.checkRolleExists("Sachbearbeiter Finanzbuchhaltung");
	    rollen.checkRolleExists("Teamleiter Finanzbuchhaltung");
	    rollen.checkRolleExists("Abteilungsleiter (FBB)");
	    rollen.checkRolleExists("Bereichsleiter (FBB)");
	    rollen.checkRolleExists("Vorstand Finanz- und Kapitalbuchhaltung");
	    rollen.checkRolleExists("Rechtsanwalt");
	    rollen.checkRolleExists("Bilanzierer");
	    rollen.checkRolleExists("Prüfer");
	    rollen.checkRolleExists("IT-Koordinator");
	    rollen.checkRolleExists("Sachbearbeiter Kundenmanagement");
	    rollen.checkRolleExists("Teamleiter Kundenmanagement");
	    rollen.checkRolleExists("Abteilungsleiter (KMS)");
	    rollen.checkRolleExists("Bereichsleiter (KMS)");
	    rollen.checkRolleExists("Vorstand (KMS)");
	    
	    //werkzeugmenue.logout();
	    
	  }

	}
