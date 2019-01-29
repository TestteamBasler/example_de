package com.baloise.qa.testautomation.gw.components.fahrzeugangaben;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWButton;
import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrDateInput;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class Fahrzeugangaben extends AGWComponent {

  @Fill(10)
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:Fin-inputEl")
  public BrStringInput fin;
  
  @Fill(20)
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:CostNew-inputEl")
  public BrStringInput neuwert;
  
  @Fill(30)
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:AnnualMiles-inputEl")
  public BrStringInput jahresfahrleistung;
  
  @Fill(40)
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:FirstRegistrationDate-inputEl")
  public BrDateInput erstzulassung;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleOwner_ExtInputSet:PFVehicleOwnerInput:PFVehicleOwnerInputMenuIcon")
  public BrElement fahrzeughalter;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleOwner_ExtInputSet:PFVehicleOwnerInput:UsePNIAsVehicleOwner-textEl")
  public BrElement fahrzeughalterwahl;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:VehicleDetails:SelectVehicleDetails")
  public BrElement fahrzeugdetails;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:CoverableDetailCardTab-btnInnerEl")
  public BrElement details;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:CoveragesCardTab-btnInnerEl")
  public BrElement deckungen;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFCovGroupBundle_ExtDV:SelectCategory_option3-inputEl")
  public GWButton khundvollkasko;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleEVBStatusInputSet:RequestVBBt-btnInnerEl")
  public BrElement evb;
  
  @Check(10)
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleEVBStatusInputSet:eVBStatus-inputEl")
  public BrLabel evbstatus;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleSFROwner:PFVehicleSFROwner_ExtInputSet:SfrLV_tb:AddLiabilitySFR-btnWrap")
  public BrElement sfrhaft;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleSFROwner:PFVehicleSFROwner_ExtInputSet:SfrLV_tb:AddLiabilitySFR:UseLiabilityPrimNamedInsured-textEl")
  public BrElement sfrhaftwahl;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleSFROwner:PFVehicleSFROwner_ExtInputSet:SfrLV_tb:AddKaskoSFR-btnWrap")
  public BrElement sfrkasko;
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:PFVehicle_ExtPanelSet:CoverableListDetailPanel:CoverableDetailsCV:PFVehicle_ExtDetailsDV:PFVehicleSFROwner:PFVehicleSFROwner_ExtInputSet:SfrLV_tb:AddKaskoSFR:CreateBasedOnLiability-textEl")
  public BrElement sfrkaskowahl;
  
  @ById("SubmissionWizard:Next-btnInnerEl")
  public BrElement weiter;
  
  public void fahrzeugangabenfuellen() {
    fill();
    fahrzeughalter.click();
    fahrzeughalterwahl.click();
    fahrzeugdetails.click();
  }
  
  public void fahrzeugangabendeckungenfuellen() {
    deckungen.click();
    khundvollkasko.click();
  }
  
  public void evbanfordern() {
    details.click();
    evb.click();
  }
  
  public void sfrhaftpflichtfuellen() {
    sfrhaft.click();
    sfrhaftwahl.click();
  }
  
  public void sfrkaskofuellen() {
    sfrkasko.click();
    sfrkaskowahl.click();
    weiter.click();
  }

}