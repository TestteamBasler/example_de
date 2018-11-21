package com.baloise.qa.testautomation.gw.components.kontoinfoseingeben;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCheckbox;
import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class KontoInfosEingeben extends AGWComponent {

  @Fill(10)
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl")
  public BrStringInput firmenname;

  @Fill(20)
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl")
  public BrStringInput vorname;
  
  @Fill(30)
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl")
  public BrStringInput nachname;
  
  @Fill(40)
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:FirstNameExact-inputEl")
  public GWCheckbox vornameexakt;
  
  @Fill(50)
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl")
  public GWCombobox land;
  
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset")
  private BrLink zuruecksetzen;
  
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
  private BrLink suchen;
  
  @ById("NewAccountPopup:NewAccountScreen:NewAccountSearchResultsLV:0:_Select")
  private BrLink auswaehlen;
  
  public void fuellenUndSuchen() {
	  zuruecksetzen.click();
	  fill();
	  suchen.click();
	  auswaehlen.click();
  }
  
  public void clickZuruecksetzen() {
	  zuruecksetzen.click();
  }
  
  public void clickSuchen() {
	  suchen.click();
  }
  
  public void clickAuswaehlen() {
	  auswaehlen.click();
  }
}
