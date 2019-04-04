package com.baloise.qa.testautomation.gw.components.pc.kontakterstellen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWDateWithPickerInput;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class KontaktErstellen extends AGWComponent {

  @Fill(5)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:Salutation_Bde-inputEl')]")
  public GWCombobox anrede;
  
  @Fill(10)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;

  @Fill(30)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:DateOfBirth-inputEl')]")
  public GWDateWithPickerInput geburtsdatum;
  
  @Fill(100)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl')]")
  public GWCombobox land;
  
  @Fill(110)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:Profession_Bde-inputEl')]")
  public GWCombobox beruf;
  
  @Fill(120)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:Branch_Bde-inputEl')]")
  public GWCombobox branche;
  
  @Fill(130)
  @ByXpath("//input[contains(@id,':ContactNameInputSet:MaritalStatus-inputEl')]")
  public GWCombobox familienstand;
  
  @Fill(160)
  @ByXpath("//input[contains(@id,':Marketing_BdeInputSet:UnfairCompetitionAct_Bde-inputEl')]")
  public GWCombobox uwg;
  
  @Fill(170)
  @ByXpath("//input[contains(@id,':Marketing_BdeInputSet:Advertising_Bde-inputEl')]")
  public GWCombobox werbung;
  
  @Fill(210)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLinesID:AddressLinesInputSet:AddressLine1-inputEl')]")
  public BrStringInput strasse;
  
  @Fill(220)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLinesID:AddressLinesInputSet:AddressLine2-inputEl')]")
  public BrStringInput hausnummer;
  
  @Fill(240)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]")
  public BrStringInput plz;
  
  @Fill(230)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]")
  public BrStringInput ort;
  
  @Fill(250)
  @ByXpath("//input[contains(@id,':ContactDV:AddressType-inputEl')]")
  public GWCombobox anschriftentyp;
  
  @Fill(260)
  @ByXpath("//input[contains(@id,':ContactDV:ContactCurrency:ContactCurrencyInputSet:PreferredSettlementCurrency-inputEl')]")
  public GWCombobox waehrung;
  
  @ByXpath("//a[contains(@id,'NewContact:ForceDupCheckUpdate')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,'NewContact:Cancel')]")
  private BrLink abbrechen;
  
  @ByXpath("//a[contains(@id,'NewContact:CheckForDuplicates')]")
  private BrLink dublikatpruefen;
  
  public void fuellenUndAnlegen() {
    fill();
    aktualisieren.click();
  }
  
  public void fuellenUndPruefen() {
    fill();
    dublikatpruefen.click();
  }
  
}
