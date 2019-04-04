package com.baloise.qa.testautomation.gw.components.bc.neuepoliceschritt1;


import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class NeuePoliceSchritt1 extends AGWComponent {

  // Policeeninformation
  @Fill(10)
  @ByXpath("//input[contains(@id,'NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyNumber-inputEl')]")
  public BrStringInput policennr;

  @Fill(30)
  @ByXpath("//input[contains(@id,'NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyPerEffDate-inputEl')]")
  public BrStringInput beginndatum;

  @Fill(40)
  @ByXpath("//input[contains(@id,'NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PolicyPerExpirDate-inputEl')]")
  public BrStringInput ablaufdatum;

  @Fill(200)
  @ByXpath("//input[contains(@id,'NewPolicyWizard:NewPolicyWizardSummaryStepScreen:NewPolicyDV:PaymentPlan-inputEl')]")
  public GWCombobox zahlungsplan;
  
  @ByXpath("//a[contains(@id,':Next')]")
  private BrLink weiter;
  
  @ByXpath("//a[contains(@id,':Cancel')]")
  private BrLink abbrechen;
  
  public void fuellenUndWeiter() {
	fill();
	weiter.click();
  }

}
