package com.baloise.qa.testautomation.gw.pc.vorbereitungpartneranlage;

import org.junit.Test;

import com.baloise.qa.testautomation.gw.components.login.Login;
import com.baloise.qa.testautomation.gw.components.pc.kontakterstellen.KontaktErstellen;
import com.baloise.qa.testautomation.gw.components.pc.kontodatei.Kontodatei;
import com.baloise.qa.testautomation.gw.components.pc.kontoerstellen.KontoErstellen;
import com.baloise.qa.testautomation.gw.components.pc.linkesmenue.LinkesMenue;
import com.baloise.qa.testautomation.gw.components.pc.topmenue.TopMenue;
import com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue.WerkzeugMenue;
import com.baloise.qa.testautomation.gw.pc.AGWZRPCTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;

@DataProvider(DataProviderType.EXCEL)
public class VorbereitungPartneranlageZRTest extends AGWZRPCTest {

  @Fill
  public Login login;
  
  public TopMenue topmenue;
  
  @Fill
  public KontaktErstellen kontakterstellen;
  
  public LinkesMenue linkesmenue;
  
  @Fill
  public KontoErstellen kontoerstellen;
  
  @Check
  public Kontodatei kontodatei;
  
  public WerkzeugMenue werkzeugmenue;
    
//  @Test
//  public void execute1() {
//  execute("kfztester");
//  }

	/*@Test
	public void execute2() {
	execute("kfzeins");
	}*/

	@Test
	public void execute3() {
	execute("kfzzwei");
	}

  public void execute(String sdate) {
    logger.info("Starting test case");
    setFill(sdate);
    setCheck(sdate);

    login.fill();
    
    werkzeugmenue.setToDeutsch();

    topmenue.selectMenueNeuerKontakt();    
  
    kontakterstellen.fuellenUndAnlegen();
    
    linkesmenue.selectNewKonto();
    
    kontoerstellen.fuellenUndAnlegen();
    
    kontodatei.check();

    werkzeugmenue.logoutAndCheck();
    
  }

}
