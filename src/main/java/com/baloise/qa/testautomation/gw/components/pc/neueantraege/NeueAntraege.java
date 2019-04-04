package com.baloise.qa.testautomation.gw.components.pc.neueantraege;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWDateWithPickerInput;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;

@DataProvider(DataProviderType.EXCEL)
public class NeueAntraege extends AGWComponent {

  @ById("NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account:SelectAccount")
  private BrElement kontosuchen;
  
  @ById("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission")
  private BrElement kfzversicherung;

  @ById("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission")
  private BrElement newprivatfahrzeug;
  
  @ById("NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl")
  private BrElement kontowaehlen;
  
  @Check(10)
  @ById("NewSubmission:NewSubmissionScreen:ProductSettingsDV:SelectProducts")
  private BrLabel angebotlabel;
  
  @Check(20)
  @ById("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-labelEl")
  private BrLabel beginnlabel;
  
  @Fill(10)
  @ById("NewSubmission:NewSubmissionScreen:ProductSettingsDV:DefaultPPEffDate-inputEl")
  private GWDateWithPickerInput beginndatum;
  
  @ById("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body")
  private BrElement produkttabelle;

  public void kontoSuchen() {
	kontosuchen.click();
  }
  
  public void kontoWaehlen() {
    kontowaehlen.click();
    }
  
  public void selectKfzVersicherung() {
	kfzversicherung.click();
  }

  public void newPrivatFahrzeug() {
    newprivatfahrzeug.click();
  }
  
  public void checkProduktExists (String produktname) {
    existTableText(produkttabelle, produktname);
    //existMultiTableText(produkttabelle, produktname);
    }

}
