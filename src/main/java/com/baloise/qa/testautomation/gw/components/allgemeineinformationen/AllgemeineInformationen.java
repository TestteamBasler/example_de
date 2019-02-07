package com.baloise.qa.testautomation.gw.components.allgemeineinformationen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class AllgemeineInformationen extends AGWComponent {

  @Fill(10)
  @ById("FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl")
  public GWCombobox name;
  
  @ById("FNOLWizard:Next")
  public BrElement weiter;
  
  public void allgemeineinformationenfuellen() {
    fill();
    weiter.click();
  }

}