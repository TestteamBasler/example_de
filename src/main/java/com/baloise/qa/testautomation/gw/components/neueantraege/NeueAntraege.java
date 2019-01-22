package com.baloise.qa.testautomation.gw.components.neueantraege;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;

public class NeueAntraege extends AGWComponent {

  @ById("NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account:SelectAccount")
  private BrElement kontosuchen;
  
  @ById("NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:7:addSubmission")
  private BrElement newprivatfahrzeug;

  public void kontoSuchen() {
	  kontosuchen.click();
  }
  
  public void newPrivatFahrzeug() {
    newprivatfahrzeug.click();
  }

}
