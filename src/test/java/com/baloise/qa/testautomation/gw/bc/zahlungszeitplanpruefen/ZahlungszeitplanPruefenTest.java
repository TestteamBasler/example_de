package com.baloise.qa.testautomation.gw.bc.zahlungszeitplanpruefen;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.bc.kontensuche.KontenSuche;
import com.baloise.qa.testautomation.gw.components.bc.kontozusammenfassung.KontoZusammenfassung;
import com.baloise.qa.testautomation.gw.components.bc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.bc.neuepoliceschritt1.NeuePoliceSchritt1;
import com.baloise.qa.testautomation.gw.components.bc.neuepoliceschritt2.NeuePoliceSchritt2;
import com.baloise.qa.testautomation.gw.components.bc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.bc.zahlungszeitplan.Zahlungszeitplan;
import com.baloise.qa.testautomation.gw.components.bc.zeitreise.Zeitreise;
import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.bc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.bc.AGWZRBCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class ZahlungszeitplanPruefenTest extends AGWZRBCTest {

  @Fill
  public Login login;
  
  @Fill
  public Zeitreise zeitreise;
 
  public TopMenue topmenue;
  
  public LinkesMenue linkesmenue;

  @Fill
  public KontenSuche kontensuche;
  
  @Fill
  public NeuePoliceSchritt1 schritt1;
  
  @Fill
  public NeuePoliceSchritt2 schritt2;
  
  @Fill
  public KontoZusammenfassung zusammenfassung;
  
  @Check
  public Zahlungszeitplan zahlungszeitplan;
  
  public WerkzeugMenue werkzeugmenue;
  
  /*@Test
  public void execute1() {
    execute("mtluntmitte");
  }

  @Test
  public void execute2() {
    execute("mtlteilmitte");
  }

  @Test
  public void execute3() {
    execute("mtlteilanfang");
  }

  @Test
  public void execute4() {
    execute("mtluntanfang");
  }

  @Test
  public void execute5() {
    execute("vjteilanfang");
  }

  @Test
  public void execute6() {
    execute("hjuntmitte");
  }

  @Test
  public void execute7() {
    execute("jähuntmitte");
  }

  @Test
  public void execute8() {
    execute("jähanfanggt5");
  }

  @Test
  public void execute9() {
    execute("hjmittelt5");
  }
  */

  @Test
  public void execute10() {
    execute("mtluntmitte");
  }

  public void execute(String sdata) {
    logger.info("Starting test case");
    setFill(sdata);
    setCheck(sdata);

    login.fill();
    
    zeitreise.fill();
    
    /*
    boolean kontoexist = false;
    if (kontoexist) {
      topmenue.selectErstesKonto();  
    } else {
      topmenue.selectKontoPage();
      
      kontensuche.fuellenSuchenUndAuswaehlen();
      
      linkesmenue.selectNewPolice();
      
      schritt1.fuellenUndWeiter();
      
      schritt2.fuellenUndFertig();
    }
    
    zusammenfassung.fill();
    
    linkesmenue.selectZahlungszeitplan();
    
    zahlungszeitplan.check();
    */
    
    werkzeugmenue.logoutAndCheck();
    
  }

}
