package com.baloise.qa.testautomation.gw.components.cc.benutzergrundlagen;

import static org.junit.Assert.assertTrue;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
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
public class BenutzerGrundlagen extends AGWComponent {

  @ByXpath("//a[contains(@id,':NewUserDetailScreen:BasicsCardTab')]")
  private BrLink grundlagen;
	  
  @Fill(10)
  @ByXpath("//input[contains(@id,':NewUserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:Prefix-inputEl')]")
  public GWCombobox anrede;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,':NewUserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;

  @Fill(40)
  @ByXpath("//input[contains(@id,':NewUserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;
  
  @Fill(60)
  @ByXpath("//input[contains(@id,':NewUserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Username-inputEl')]")
  public BrStringInput benutzername;

  @Fill(70)
  @ByXpath("//input[contains(@id,':NewUserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:PasswordInputWidget-inputEl')]")
  @ById("NewUser")
  public BrStringInput kennwort;
  
  @Fill(80)
  @ByXpath("//input[contains(@id,':NewUserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:ConfirmInputWidget-inputEl')]")
  public BrStringInput confirm;
  
  @ById("centerPanel-table")
  private BrElement auswahltree;
	  
  @ByXpath("//div[text()='<leer>'][1]")
  private BrElement ele;
	  
  @ByXpath("//a[contains(@id,':NewUserDetailScreen:Update')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':NewUserDetailScreen:Cancel')]")
  private BrLink abbrechen;
  
  @ByXpath("//a[contains(@id,':NewUserDetailScreen:UserDetailDV:UserRolesLV_tb:Add')]")
  private BrLink rollehinzufuegen;
  
  @ByXpath("//a[contains(@id,':NewUserDetailScreen:UserDetailDV:UserGroupsLV_tb:Add')]")
  private BrLink gruppehinzufuegen;
  
  public void fuellen() {
	grundlagen.click();
	fill();
  }
  
  public void fuellenUndAnlegen() {
	grundlagen.click();
	fill();
	aktualisieren.click();
  }
  
  public void fuellenMitRollenGruppenUndAnlegen(String srollen, String sGruppen) {
	grundlagen.click();
	fill();
	// Rollen auswählen
	String[] aValues = srollen.split(";");
	for (String temp : aValues) {
	  rollehinzufuegen.click();
	  ele.click();
	  try {
		//auswahltree.find().
	    getBrowserFinder().getDriver().findElement(By.xpath("//li[text()='" + temp + "']")).click();
	  } catch (NoSuchElementException e) {
		assertTrue ("Rollen-Auswahl '" + temp+ "' ist nicht vorhanden", false); 
	  }
	}
	//gruppen auswählen
	aValues = sGruppen.split(";");
	for (String temp : aValues) {
 	  gruppehinzufuegen.click();
      try {
    	auswahltree.find().findElement(By.xpath("//table[@id='OrganizationGroupTreePopup-table']//span[text()='" + temp + "']")).click();
	  } catch (NoSuchElementException e) {
		assertTrue ("Zugriff-Auswahl '" + temp + "' ist nicht vorhanden", false); 
	  }
	}	
	aktualisieren.click();
  }

}
