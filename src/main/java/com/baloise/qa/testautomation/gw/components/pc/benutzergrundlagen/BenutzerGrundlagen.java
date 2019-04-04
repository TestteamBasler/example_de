package com.baloise.qa.testautomation.gw.components.pc.benutzergrundlagen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class BenutzerGrundlagen extends AGWComponent {

  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetail_BasicCardTab')]")
  private BrLink grundlagen;
	  
  @Fill(10)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:Prefix-inputEl')]")
  public GWCombobox anrede;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;

  @Fill(40)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Name:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;
  
  @Fill(60)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:Username-inputEl')]")
  public BrStringInput benutzername;

  @Fill(70)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:PasswordInputWidget-inputEl')]")
  @ById("NewUser")
  public BrStringInput kennwort;
  
  @Fill(80)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:UserDetailCommons:UserDetailInputSet:ConfirmInputWidget-inputEl')]")
  public BrStringInput confirm;
  
  @Fill(120)
  @ById("NewUser:UserDetailScreen:UserDetailDV:UserType-inputEl")
  public GWCombobox benutzertyp;
  
  @Fill(150)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserDetailDV:PrimaryPhone-inputEl')]")
  public GWCombobox primaeretelefonnummer;
  
  @Fill(160)
  @ByXpath("//input[contains(@id,'Phone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl')]")
  public BrStringInput telefonnummer;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Update')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Cancel')]")
  private BrLink abbrechen;
  
  public void fuellen() {
	  grundlagen.click();
	  fill();
  }
  
  public void fuellenUndAnlegen() {
	  grundlagen.click();
	  fill();
	  aktualisieren.click();
  }

}
