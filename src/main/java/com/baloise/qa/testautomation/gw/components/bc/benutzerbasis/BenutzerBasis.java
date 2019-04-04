package com.baloise.qa.testautomation.gw.components.bc.benutzerbasis;

import static org.junit.Assert.assertTrue;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
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
public class BenutzerBasis extends AGWComponent {

  @Fill(10)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:GlobalPersonNameInputSet:Prefix-inputEl')]")
  public GWCombobox anrede;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;

  @Fill(40)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;
  
  @Fill(60)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:Username-inputEl')]")
  public BrStringInput benutzername;

  @Fill(70)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:PasswordInputWidget-inputEl')]")
  public BrStringInput kennwort;
  
  @Fill(80)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:ConfirmInputWidget-inputEl')]")
  public BrStringInput confirm;
  
  @Fill(90)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:UserPreferencesInputSet:Language-inputEl')]")
  public GWCombobox benutzersprache;
  
  @Fill(100)
  @ByXpath("//input[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:UserPreferencesInputSet:RegionalFormats-inputEl')]")
  public GWCombobox regionalesformat;
  
  @ByXpath("//div[text()='<leer>'][1]")
  private BrElement ele;
	  
  @ByXpath("//a[contains(@id,':Next')]")
  private BrLink weiter;
  
  @ByXpath("//a[contains(@id,':Cancel')]")
  private BrLink abbrechen;
  
  @ByXpath("//a[contains(@id,':NewUserWizardBasicStepScreen:UserDetailDV:UserRolesLV_tb:Add')]")
  private BrLink hinzufuegen;
  
  public void fuellenUndWeiter() {
	fill();
	weiter.click();
  }

  public void fuellenMitRollenUndWeiter(String rollenliste) {
	fill();
	String[] aValues = rollenliste.split(";");
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
	weiter.click();
  }

}
