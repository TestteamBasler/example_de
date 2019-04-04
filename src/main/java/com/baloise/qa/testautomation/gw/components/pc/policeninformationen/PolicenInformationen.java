package com.baloise.qa.testautomation.gw.components.pc.policeninformationen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWDateWithPickerInput;
import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;

@DataProvider(DataProviderType.EXCEL)
public class PolicenInformationen extends AGWComponent {

  @Fill(5)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:AccountInfoInputSet:OrganizationType-inputEl")
  public GWCombobox organisationstyp;

  @Fill(10)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:TermType-inputEl")
  public GWCombobox laufzeittyp;

  @Fill(20)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:EffectiveDate-inputEl")
  public GWDateWithPickerInput inkrafttretens;
  
  @Fill(30)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:PaymentPlan-inputEl")
  public GWCombobox zahlungsperiode;
  
  @Fill(40)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:ExpirationDate-inputEl")
  public GWDateWithPickerInput ablaufdatuminput;
  
  @Fill(50)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:EffectiveDate-inputEl")
  public GWDateWithPickerInput begindatum;

  @Fill(60)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:UWCompanyInputSet:UWCompany-inputEl")
  public GWCombobox risikotraeger;
  
  @Check(10)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:ExpirationDate-inputEl")
  public BrLabel ablaufdatum;
  
  @Check(20)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoBdeDV:PolicyInfo_BdeInputSet:PolicyDuration-inputEl")
  public BrLabel policendauer;
  
  @ById("SubmissionWizard:Next")
  public BrElement weiter;
  
  public void policefuellen() {
    fill();
  	weiter.click();
  }
  
  public void policefuellenundkontrolieren() {
    fill();
    check();
    weiter.click();
    }


}
