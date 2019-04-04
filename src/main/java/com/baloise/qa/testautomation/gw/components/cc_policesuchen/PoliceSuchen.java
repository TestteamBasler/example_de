package com.baloise.qa.testautomation.gw.components.cc_policesuchen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrDateInput;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class PoliceSuchen extends AGWComponent {

  @Fill(10)
  @ById("FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:policyNumber-inputEl")
  public BrStringInput policenr;
  
  @Fill(20)
  @ById("FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate-inputEl")
  public BrDateInput schadensdatum;
  
  @Fill(30)
  @ById("FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_lossTime-inputEl")
  public GWCombobox zeit;
  
  @ById("FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Search")
  public BrElement suchen;
  
  @ById("FNOLWizard:Next")
  public BrElement weiter;
  
  public void policesuchefuellen() {
    setFill("ccneu");
    fill();
    suchen.click();
    setFill("ccneuw");
    fill();
    weiter.click();
  }

}