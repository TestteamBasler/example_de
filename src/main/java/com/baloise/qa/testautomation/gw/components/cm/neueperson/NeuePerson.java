package com.baloise.qa.testautomation.gw.components.cm.neueperson;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrDateInput;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.CSV)
public class NeuePerson extends AGWComponent {

  @Fill(10)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:GlobalPersonNameInputSet:Prefix-inputEl")
  public GWCombobox anrede;
  
  @Fill(20)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:GlobalPersonNameInputSet:FirstName-inputEl")
  public BrStringInput vorname;
  
  @Fill(40)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:GlobalPersonNameInputSet:LastName-inputEl")
  public BrStringInput nachname;
  
  @ByXpath("//div[@id='NewContact:ABContactDetailScreen:ContactBasicsDV:TagsInputSet:Tags-innerCt']//li[text()='Anbieter']")
  public BrElement taganbieter;

  @ByXpath("//div[@id='NewContact:ABContactDetailScreen:ContactBasicsDV:TagsInputSet:Tags-innerCt']//li[text()='Kunde']")
  public BrElement tagkunde;

  @ByXpath("//div[@id='NewContact:ABContactDetailScreen:ContactBasicsDV:TagsInputSet:Tags-innerCt']//li[text()='Schadensfallpartei']")
  public BrElement tagschadensfallpartei;


  @Fill(80)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:AddressOwnerInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl")
  public GWCombobox land;
  
  @Fill(90)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:AddressOwnerInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl")
  public BrStringInput adresse1;
  
  @Fill(120)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:AddressOwnerInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-triggerWrap")
  public BrStringInput plz;

  @Fill(130)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:AddressOwnerInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl")
  public BrStringInput ort;
  

  @Fill(220)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:DateOfBirth-inputEl")
  public BrDateInput geburtsdatum;
  
  @Fill(230)
  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV:Gender-inputEl")
  public GWCombobox geschlecht;

  @ById("NewContact:ABContactDetailScreen:ContactBasicsDV_tb:Update")
  public BrLink aktualisieren;

  @ByXpath("//table[@id='x-unsavedwork-table']//a[text()='Ansprechpartner']")
  public BrLink ansprechpartner;


  public void neueAnbieterFuellen() {
    fill();
	taganbieter.click();
	aktualisieren.click();
  }
	  
  public void neueKundeFuellen() {
    fill();
	tagkunde.click();
	aktualisieren.click();
  }
		  
  public void neueSchadensfallParteiFuellen() {
    fill();
    tagschadensfallpartei.click();
    aktualisieren.click();
  }
  	  
}