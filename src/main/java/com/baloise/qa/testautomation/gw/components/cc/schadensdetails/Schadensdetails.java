package com.baloise.qa.testautomation.gw.components.cc.schadensdetails;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCheckbox;
import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class Schadensdetails extends AGWComponent {

  @Fill(10)
  @ById("FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Description-inputEl")
  public BrStringInput wasistpassiert;
  
  @Fill(20)
  @ById("FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_LossCause-inputEl")
  public GWCombobox schadensursache;
  
  @Fill(30)
  @ById("FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker-inputEl")
  public GWCombobox ort;
  
  @ById("FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_lossTime-inputEl")
  public GWCheckbox nurvorfall;
  
  @ById("FNOLWizard:Next")
  public BrElement weiter;
  
  public void schadensdetailsfuellen() {
    fill();
    weiter.click();
  }

}