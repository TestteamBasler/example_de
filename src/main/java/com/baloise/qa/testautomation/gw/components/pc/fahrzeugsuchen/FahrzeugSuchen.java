package com.baloise.qa.testautomation.gw.components.pc.fahrzeugsuchen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class FahrzeugSuchen extends AGWComponent {

  @Fill(10)
  @ById("PFVehicleDetails_ExtSearchPopup:PFVechicleDetailsSearchScreen:PFVehicleDetails_ExtMakeModelSearchDV:Make-inputEl")
  public GWCombobox fabrikat;
  
  @Fill(20)
  @ById("PFVehicleDetails_ExtSearchPopup:PFVechicleDetailsSearchScreen:PFVehicleDetails_ExtMakeModelSearchDV:VehicleModelInput:Model-inputEl")
  public GWCombobox modell;
  
  @ById("PFVehicleDetails_ExtSearchPopup:PFVechicleDetailsSearchScreen:PFVehicleDetails_ExtMakeModelSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
  public BrElement suchen;
  
  @ById("PFVehicleDetails_ExtSearchPopup:PFVechicleDetailsSearchScreen:VehicleDetailsSearchResultsLV:1:_Select")
  public BrElement auswahl;
  
  public void fahrzeugdetailsfuellen() {
    fill();
    suchen.click();
    auswahl.click();
  }

}