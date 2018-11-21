package com.baloise.qa.testautomation.gw.components.linkesmenue;

import org.openqa.selenium.Keys;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class LinkesMenue extends AGWComponent {

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_RelatedAccounts")
  private BrElement zugehoerigekonten;

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_Documents")
  private BrElement dokumente;

  @ById("AccountFile:MenuLinks:AccountFile_AccountFile_Notes")
  private BrElement notizen;

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
