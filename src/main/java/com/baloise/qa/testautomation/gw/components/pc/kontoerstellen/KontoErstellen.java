package com.baloise.qa.testautomation.gw.components.pc.kontoerstellen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;
import org.openqa.selenium.Keys;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class KontoErstellen extends AGWComponent {

  @Fill(10)
  @ByXpath("//input[contains(@id,':CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;
  
  @Fill(20)
  @ByXpath("//input[contains(@id,':CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;


  @Fill(100)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl')]")
  public GWCombobox land;
  
  @Fill(110)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLinesID:AddressLinesInputSet:AddressLine1-inputEl')]")
  public BrStringInput strasse;
  
  @Fill(120)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLinesID:AddressLinesInputSet:AddressLine2-inputEl')]")
  public BrStringInput hausnummer;
  
  @Fill(140)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl')]")
  public BrStringInput plz;

  @Fill(130)
  @ByXpath("//input[contains(@id,':AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl')]")
  public BrStringInput ort;
  
  @Fill(150)
  @ByXpath("//input[contains(@id,':AddressType-inputEl')]")
  public GWCombobox anschriftentyp;
  
  @Fill(160)
  @ByXpath("//input[contains(@id,':EncashmentDate-inputEl')]")
  public GWCombobox inkassozeitpunkt;
  
  @Fill(170)
  @ByXpath("//input[contains(@id,':ProducerSelectionInputSet:Producer-inputEl')]")
  public BrStringInput organisation;
  
  @Fill(180)
  @ByXpath("//input[contains(@id,':ProducerSelectionInputSet:ProducerCode-inputEl')]")
  public GWCombobox vermittler;
  
  @ByXpath("//a[contains(@id,':CreateAccountScreen:ForceDupCheckUpdate')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':CreateAccountScreen:Cancel')]")
  private BrLink abbrechen;
  
  @ByXpath("//a[contains(@id,':CreateAccountScreen:CheckForDuplicates')]")
  private BrLink dublikatpruefen;
  
  public void fuellenUndAnlegen() {
	  fill();
	  vermittlerwaehlen();
	  aktualisieren.click();
  }
  
  public void fuellenUndPruefen() {
	  fill();
	  dublikatpruefen.click();
  }
  
  public void vermittlerwaehlen() {
    vermittler.click();
    vermittler.find().sendKeys(Keys.DOWN);
    vermittler.find().sendKeys(Keys.DOWN);
    vermittler.find().sendKeys(Keys.ENTER);
  }
  
}
