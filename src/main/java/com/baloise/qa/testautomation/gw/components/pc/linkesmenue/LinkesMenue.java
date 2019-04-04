package com.baloise.qa.testautomation.gw.components.pc.linkesmenue;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class LinkesMenue extends AGWComponent {

  @ById("AccountFile:AccountFileMenuActions-btnInnerEl")
  private BrElement kontoaktionen;
  
  @ById("ContactFile:ContactFileMenuActions")
  private BrElement kontaktaktionen;
  
  @ById("AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl")
  private BrLink newsubmission;
  
  @ById("ContactFile:ContactFileMenuActions:ContactFileMenuActions_Create:ContactFileMenuActions_NewAccount-itemEl")
  private BrLink newkonto;
  
  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_RelatedAccounts")
  private BrElement zugehoerigekonten;

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_Documents")
  private BrElement dokumente;

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_Notes")
  private BrElement notizen;

  @ById("Admin:AdminMenuActions")
  private BrElement adminaktionen;
  
  @ById("Admin:AdminMenuActions:AdminMenuActions_Create:AdminMenuActions_NewUser-itemEl")
  private BrLink newuser;
  
  public void selectNewSubmission() {
    kontoaktionen.click();
    newsubmission.click();
  }
  
  public void selectNewKonto() {
    kontaktaktionen.click();
    newkonto.click();
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
  
  public void selectNewUser() {
    adminaktionen.click();
    newuser.click();
  }
  
}
