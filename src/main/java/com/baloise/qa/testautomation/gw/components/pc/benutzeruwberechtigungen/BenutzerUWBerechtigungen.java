package com.baloise.qa.testautomation.gw.components.pc.benutzeruwberechtigungen;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class BenutzerUWBerechtigungen extends AGWComponent {

  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetail_AuthorityCardTab')]")
  private BrLink rechte;
	  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserAuthorityLV_tb:Add')]")
  private BrLink hinzufuegen;
	  
  @ByXpath("//div[text()='<leer>'][1]")
  private BrElement ele;
	  
  @Fill(10)
  public BrStringInput uwliste;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Update')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Cancel')]")
  private BrLink abbrechen;
  
  @Override
  public void fill() {
	if (!(uwliste.fillValue().isSkip() || uwliste.fillValue().isNull() || uwliste.fillValue().isEmpty())) {
	  String[] aValues = uwliste.fillValueAsString().split(";");
	  for (String temp : aValues) {
		hinzufuegen.click();
		ele.click();
	    try {
	    	//auswahltree.find().
	    	getBrowserFinder().getDriver().findElement(By.xpath("//li[text()='" + temp + "']")).click();
		  } catch (NoSuchElementException e) {
			assertTrue ("UW-Berechtigung-Auswahl '" + temp+ "' ist nicht vorhanden", false); 
		  }
	  }
	}
  }
  
  public void fuellen() {
	rechte.click();
	fill();
  }
  
  public void fuellenUndAnlegen() {
	rechte.click();
	fill();
	aktualisieren.click();
  }

}
