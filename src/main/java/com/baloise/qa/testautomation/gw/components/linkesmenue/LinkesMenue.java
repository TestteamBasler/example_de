package com.baloise.qa.testautomation.gw.components.linkesmenue;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class LinkesMenue extends AGWComponent {

  @ById("AccountFile:AccountFileMenuActions-btnInnerEl")
  private BrElement aktionen;
  
  @ById("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl")
  private BrLink newSubmission;
  
  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_RelatedAccounts")
  private BrElement zugehoerigekonten;

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_Documents")
  private BrElement dokumente;

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_Notes")
  private BrElement notizen;

  public void selectAktionen() {
    aktionen.click();
  }
  
  public void selectNewSubmission() {
    newSubmission.click();
  }
  
  public void selectZugehoerigeKonten() {
	  zugehoerigekonten.click();
  }
  
  public void selectDokumente() {
	  dokumente.click();
  }
  
  public void selectNotizen() {
	  notizen.click();
  }
  
}
