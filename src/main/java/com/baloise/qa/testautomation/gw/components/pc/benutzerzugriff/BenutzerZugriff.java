package com.baloise.qa.testautomation.gw.components.pc.benutzerzugriff;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class BenutzerZugriff extends AGWComponent {

  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetail_AccessCardTab')]")
  private BrLink zugriff;
	  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetail_AccessDV:UserGroupsLV_tb:Add')]")
  private BrLink hinzufuegen;
	  
  @ById("OrganizationGroupTreePopup:OrganizationGroupTreePopupScreen:OrganizationGroupTreePopup:OrganizationGroupTreePopupPicker-body")
  private BrElement auswahltree;
	  
  @Fill(10)
  public BrStringInput zugriffliste;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Update')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Cancel')]")
  private BrLink abbrechen;
  
  @Override
  public void fill() {
	if (!(zugriffliste.fillValue().isSkip() || zugriffliste.fillValue().isNull() || zugriffliste.fillValue().isEmpty())) {
	  String[] aValues = zugriffliste.fillValueAsString().split(";");
	  for (String temp : aValues) {
		hinzufuegen.click();
	    try {
	    	auswahltree.find().findElement(By.xpath("//table[@id='OrganizationGroupTreePopup-table']//span[text()='" + temp + "']")).click();
		  } catch (NoSuchElementException e) {
			assertTrue ("Zugriff-Auswahl '" + temp+ "' ist nicht vorhanden", false); 
		  }
	  }
	}
  }
  
  public void fuellen() {
	zugriff.click();
	fill();
  }
  
  public void fuellenUndAnlegen() {
	zugriff.click();
	fill();
	aktualisieren.click();
  }

}
