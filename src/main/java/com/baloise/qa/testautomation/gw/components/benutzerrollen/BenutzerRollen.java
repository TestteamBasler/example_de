package com.baloise.qa.testautomation.gw.components.benutzerrollen;

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
public class BenutzerRollen extends AGWComponent {

  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetail_RolesCardTab')]")
  private BrLink rollen;
	  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserRolesLV_tb:Add')]")
  private BrLink hinzufuegen;
	  
  @ByXpath("//div[text()='<leer>'][1]")
  private BrElement ele;
	  
  @Fill(10)
  public BrStringInput rollenliste;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Update')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Cancel')]")
  private BrLink abbrechen;
  
  @Override
  public void fill() {
	if (!(rollenliste.fillValue().isSkip() || rollenliste.fillValue().isNull() || rollenliste.fillValue().isEmpty())) {
	  String[] aValues = rollenliste.fillValueAsString().split(";");
	  for (String temp : aValues) {
		hinzufuegen.click();
		ele.click();
	    try {
	    	//auswahltree.find().
	    	getBrowserFinder().getDriver().findElement(By.xpath("//li[text()='" + temp + "']")).click();
		  } catch (NoSuchElementException e) {
			assertTrue ("Rollen-Auswahl '" + temp+ "' ist nicht vorhanden", false); 
		  }
	  }
	}
  }
  
  public void fuellen() {
	rollen.click();
	fill();
  }
  
  public void fuellenUndAnlegen() {
	rollen.click();
	fill();
	aktualisieren.click();
  }

}
