package com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabenSFR;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWDateWithPickerInput;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;
import com.baloise.testautomation.taf.browser.elements.BrLink;

@DataProvider(DataProviderType.EXCEL)
public class FahrzeugangabenSFR extends AGWComponent {

  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:CoverableDetailCardTab')]")
  public BrElement detailstab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:VehicleDriversCardTab')]")
  public BrElement fahrertab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:CoveragesCardTab')]")
  public BrElement deckungentab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:SFRTab')]")
  public BrElement sfrtab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:AddSFRPanelSet:SFRDV_tb:AddOrEdit')]")
  public BrElement sfrhinzufuegen;
  
  @ByXpath("//a[contains(@id,'AddSFRPopup:SFRScreen:Update')]")
  public BrElement ok;
  
  @Fill(10)
  @ByXpath("//input[contains(@id,'AddSFRPopup:SFRScreen:SFRDV:ClassificationReason-inputEl')]")
  public GWCombobox einstufung;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,'AddSFRPopup:SFRScreen:SFRDV:SFRInputSet:DrivngLicenseDate-inputEl')]")
  public GWDateWithPickerInput fuehrerscheindatum;
  
  @Fill(30)
  @ByXpath("//input[contains(@id,'AddSFRPopup:SFRScreen:SFRDV:SFRInputSet:DrivingLicenseCountry-inputEl')]")
  public GWCombobox fuehrerscheinland;
  
  @Check(10)
  @ByXpath("//div[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:AddSFRPanelSet:SFRLV-body')]/div/div/table/tbody/tr/td[3]/div/..")
  public BrLabel sfklasse1;
  
  @Check(20)
  @ByXpath("//div[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:AddSFRPanelSet:SFRLV-body')]/div/div/table/tbody/tr/td[3]/div/..")
  public BrLabel sfklasse2;
  
  @ById("SubmissionWizard:Next-btnInnerEl")
  public BrElement weiter;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:JobWizardToolbarButtonSet:QuoteOrReview")
  public BrLink angebot;
  
  public void SFRfuellen() {
    sfrtab.click();
    sfrhinzufuegen.click();
    fill();
    ok.click();
  }
  
  public void SFRfuellenundpruefen() {
    sfrtab.click();
    sfrhinzufuegen.click();
    fill();
    ok.click();
    check();
  }
  
  public void fuellenUndAngebot() {
    sfrtab.click();
    sfrhinzufuegen.click();
    fill();
    ok.click();
    angebot.click();
    // Wegen fehlender Regionalklassen doppelt
    angebot.click();
  }
  
}