package com.baloise.qa.testautomation.gw.components.policeninformationen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrDateInput;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class PolicenInformationen extends AGWComponent {

  @Fill(10)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl")
  public BrDateInput begindatum;
  
  @Fill(20)
  @ById("SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:UWCompanyInputSet:UWCompany-inputEl")
  public GWCombobox risikotraeger;
  
  @ById("SubmissionWizard:Next-btnInnerEl")
  public BrElement weiter;
  
  public void policefuellen() {
    fill();
	  weiter.click();
  }

}
