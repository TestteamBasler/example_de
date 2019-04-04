package com.baloise.qa.testautomation.gw.bc.zahlplaenepruefen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.abrechnungsplaene.Abrechnungsplaene;
import com.baloise.qa.testautomation.gw.components.bc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class AbrechnungsplaenePruefenTest extends AGWBCTest {

  @Fill
  public Login login;
  
  public LinkesMenue linkesmenue;
  
  public Abrechnungsplaene abrechnungsplaene;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Test
  public void execute1() {
    execute();
  }

  public void execute() {
    logger.info("Starting test case");
    setFill("su_pruefen");

    login.fill();
    
    linkesmenue.selectAbrechnungsplaene();
    
    abrechnungsplaene.checkZahlungsplanExists("Vorlaufzeit");
    abrechnungsplaene.checkZahlungsplanExists("Nicht reaktive Vorlaufzeit");
    
    werkzeugmenue.logoutAndCheck();
    
  }

}
