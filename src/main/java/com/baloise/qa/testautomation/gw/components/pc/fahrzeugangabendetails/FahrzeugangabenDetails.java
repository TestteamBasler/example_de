package com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendetails;

import static org.junit.Assert.fail;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrDateInput;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class FahrzeugangabenDetails extends AGWComponent {

  @Fill(10)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:Fin-inputEl')]")
  public BrStringInput fin;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:CostNew-inputEl')]")
  public BrStringInput neuwert;
  
  @Fill(30)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:CostAdditional-inputEl')]")
  public BrStringInput mehrwert;
  
  @Fill(38)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleParking-inputEl')]")
  public GWCombobox nachtstellplatz;
  
  @Fill(40)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:AnnualMileage-inputEl')]")
  public BrStringInput jahresfahrleistung;
  
  @Fill(42)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:CurrentMileage-inputEl')]")
  public BrStringInput altkmstand;
  
  @Fill(44)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:MileageDate-inputEl')]")
  public BrDateInput datumkmstand;
  
  @Fill(50)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:FirstRegistrationDate-inputEl')]")
  public BrDateInput erstzulassung;
  
  @Fill(55)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:RegistrationDatePolicyHolderInput-inputEl')]")
  public BrDateInput zulassungaufvn;
  
  @Fill(60)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetails-inputEl')]")
  public BrStringInput hsntsn;
  
  @Fill(70)
  @ByXpath("//input[contains(@id,':PFLicensePlate_ExtInputSet:LicensePlate-inputEl')]")
  public BrStringInput kennzeichen;
  
  @Fill(72)
  @ByXpath("//input[contains(@id,':RiskIndicator_BdeInputSet:RegistrationPostCode-inputEl')]")
  public BrStringInput zulassungsplz;
  
  @Fill(75)
  @ByXpath("//input[contains(@id,':PFVehicleOwner_BdeInputSet:VehicleOwnerType_Bde-inputEl')]")
  public GWCombobox fahrzeughalter;
  
  @Fill(80)
  @ByXpath("//input[contains(@id,':PFVehicleOwner_BdeInputSet:PFVehicleOwnerInput-inputEl')]")
  public GWCombobox abwfahrzeughalter;
  
  @Fill(90)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:RiskIndicatorInputSet:RiskIndicator_BdeInputSet:VehRiskIndicator-inputEl')]")
  public GWCombobox wagniskennziffer;
  
  @ByXpath("//a[contains(@id,':PFVehicleOwnerInput:PFVehicleOwnerInputMenuIcon')]")
  public BrLink weiterefahrzeughalter;
  
  @ByXpath("//a[contains(@id,':PFVehicleOwner_BdeInputSet:PFVehicleOwnerInput:UsePNIAsVehicleOwner-itemEl')]")
  public BrLink weiterefahrzeughalterwahl;
  
  @ByXpath("//a[contains(@id,':ChangeLicensePlateTypeButton:ChangeLicensePlateTypeButtonMenuIcon')]")
  public BrLink kennzeichenart;
  
  @ByXpath("//a/span[text()='Amtliches Kennzeichen']/..")
  public BrLink kennzeichenartwahlamtken;
  
  @ByXpath("//a/span[text()='E-Kennzeichen']/..")
  public BrLink kennzeichenartwahleken;
  
  @ByXpath("//a/span[text()='Grünes Kennzeichen']/..")
  public BrLink kennzeichenartwahlgruken;
  
  @ByXpath("//a/span[text()='Kein amtliches Kennzeichen vorhanden']/..")
  public BrLink kennzeichenartwahlkeinamtken;
  
  @ByXpath("//a/span[text()='Kurzzeitkennzeichen']/..")
  public BrLink kennzeichenartwahlkurzken;
  
  @ByXpath("//a/span[text()='Saisonkennzeichen']/..")
  public BrLink kennzeichenartwahlsaisonken;
  
  @ByXpath("//a/span[text()='Wechselkennzeichen']/..")
  public BrLink kennzeichenartwahlwechsken;
  
  @ByXpath("//div[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetails:SelectVehicleDetails')]")
  public BrElement fahrzeugdetails;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:CoverableDetailCardTab')]")
  public BrElement detailstab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:VehicleDriversCardTab')]")
  public BrElement fahrertab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:CoveragesCardTab')]")
  public BrElement deckungentab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:SFRTab')]")
  public BrElement sfrtab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdeDetailsDV:PFVehicleEVBStatusInputSet:NewRegistrationInput:RequestVBBt')]")
  public BrElement evb;
  
  @Check(10)
  @ByXpath("//div[contains(@id,':PFVehicleEVBStatusInputSet:eVBStatus-inputEl')]")
  public BrLabel evbstatus;
  
  @Check(20)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetailsInputSet:Make-inputEl')]")
  public BrStringInput fabrikat;
  
  @Check(30)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetailsInputSet:Model-inputEl')]")
  public BrStringInput modell;
  
  @Check(40)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetailsInputSet:EnginePower-inputEl')]")
  public BrStringInput motorleistung;
  
  @Check(50)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetailsInputSet:TypeClassLiability-inputEl')]")
  public BrStringInput typklassekh;
  
  @Check(60)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetailsInputSet:TypeClassFullKasko-inputEl')]")
  public BrStringInput typklassevk;
  
  @Check(70)
  @ByXpath("//input[contains(@id,':PFVehicle_BdeDetailsDV:VehicleDetailsInputSet:TypeClassPartKasko-inputEl')]")
  public BrStringInput typklassetk;
  
  @ById("SubmissionWizard:Next-btnInnerEl")
  public BrElement weiter;
  
  public void fahrzeugangabenfuellen() {
    detailstab.click();
    weiterefahrzeughalter.click();
    weiterefahrzeughalterwahl.click();
    fill();
    fahrzeugdetails.click();
  }
  
  public void minimumfahrzeugangabenfuellen() {
    detailstab.click();
    weiterefahrzeughalter.click();
    weiterefahrzeughalterwahl.click();
    fill();
    weiter.click();
    checkErrorMessagePresence();
  }
  
  public void fahrzeugangabenfuellenundkontrollieren() {
    detailstab.click();
    weiterefahrzeughalter.click();
    weiterefahrzeughalterwahl.click();
    fill();
    evbanfordern();
    check();
  }
	  
  public void evbanfordern() {
    detailstab.click();
    evb.click();
  }
  
  public void SFRplausikontrolle() {
    detailstab.click();
    if (sfrtab.exists()) {
      fail ("SFR Tab exists!");
      }
    kennzeichenart.click();
    kennzeichenartwahlamtken.click();
    if (!sfrtab.exists()) {
      fail ("SFR Tab does not exists!");
      }
    fill();
    if (sfrtab.exists()) {
      fail ("SFR Tab exists!");
      }
  }
  

}