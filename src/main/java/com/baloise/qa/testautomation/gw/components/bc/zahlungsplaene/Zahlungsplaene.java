package com.baloise.qa.testautomation.gw.components.bc.zahlungsplaene;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;

public class Zahlungsplaene extends AGWComponent {

  @ById("PaymentPlans:PaymentPlansScreen:PaymentPlansLV-body")
  private BrElement zahlungsplaenetabelle;
  

  public void checkZahlungsplanExists (String zahlungsplanname) {
	existMultiTableText(zahlungsplaenetabelle, zahlungsplanname);
  }
  
}
