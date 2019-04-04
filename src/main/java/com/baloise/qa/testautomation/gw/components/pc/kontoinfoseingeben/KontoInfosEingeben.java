package com.baloise.qa.testautomation.gw.components.pc.kontoinfoseingeben;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class KontoInfosEingeben extends AGWComponent {

  @Fill(10)
  @ByXpath("//input[contains(@id,':AccountSearch_BdeDV:GlobalContactNameInputSet:Name-inputEl')]")
  public BrStringInput firmenname;

  @Fill(20)
  @ByXpath("//input[contains(@id,':AccountSearch_BdeDV:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;
  
  @Fill(30)
  @ByXpath("//input[contains(@id,':AccountSearch_BdeDV:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;
  
  @Fill(60)
  @ByXpath("//input[contains(@id,':AccountSearch_BdeDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl')]")
  public GWCombobox land;
  
  @Fill(70)
  @ByXpath("//input[contains(@id,':AccountSearch_BdeDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]")
  public BrStringInput ort;
  
  @Fill(80)
  @ByXpath("//input[contains(@id,':AccountSearch_BdeDV:AddressOwnerAddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]")
  public BrStringInput plz;
  
  @ByXpath("//a[contains(@id,':AccountSearch_BdeDV:Reset')]")
  private BrLink zuruecksetzen;
  
  @ByXpath("//a[contains(@id,':AccountSearch_BdeDV:Search')]")
  private BrLink suchen;
  
  @ByXpath("//a[contains(@id,':NewAccountSearchResultsLV:0:_Select')]")
  private BrLink auswaehlen;
  
  @ByXpath("//a[contains(@id,':NewAccountButton')]")
  private BrLink neueskonto;
  
  @ByXpath("//a[contains(@id,':NewAccountButton:NewAccount_Person-itemEl')]")
  private BrLink neueperson;
  
  public void fuellenUndSuchen() {
	  zuruecksetzen.click();
	  fill();
	  suchen.click();
	  auswaehlen.click();
  }
  
  public void fuellenUndNeuePerson() {
	  zuruecksetzen.click();
	  fill();
	  suchen.click();
	  neueskonto.click();
	  neueperson.click();
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
