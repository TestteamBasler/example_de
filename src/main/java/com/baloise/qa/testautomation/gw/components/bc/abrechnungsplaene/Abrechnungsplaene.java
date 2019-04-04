package com.baloise.qa.testautomation.gw.components.bc.abrechnungsplaene;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;

public class Abrechnungsplaene extends AGWComponent {

  @ById("BillingPlans:BillingPlansScreen:BillingPlansLV")
  private BrElement abrechnungsplaenetabelle;
  

  public void checkZahlungsplanExists (String abrechnungsplanname) {
	existMultiTableText(abrechnungsplaenetabelle, abrechnungsplanname);
  }
  
}
