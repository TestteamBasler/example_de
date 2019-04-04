package com.baloise.qa.testautomation.gw.bc.abrechnungsplaenepruefen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.bc.zahlungsplaene.Zahlungsplaene;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class ZahlplaenePruefenTest extends AGWBCTest {

  @Fill
  public Login login;
  
  public LinkesMenue linkesmenue;
  
  public Zahlungsplaene zahlungsplaene;
  
  public WerkzeugMenue werkzeugmenue;
  
  @Test
  public void execute1() {
    execute();
  }

  public void execute() {
    logger.info("Starting test case");
    setFill("su_pruefen");

    login.fill();
    
    linkesmenue.selectZahlungsplaene();
    
    zahlungsplaene.checkZahlungsplanExists("Monatliche Zahlweise");
    zahlungsplaene.checkZahlungsplanExists("Vierteljährliche Zahlweise");
    zahlungsplaene.checkZahlungsplanExists("Halbjährliche Zahlweise");
    zahlungsplaene.checkZahlungsplanExists("Jährliche Zahlweise");
    
    werkzeugmenue.logoutAndCheck();
    
  }

}
