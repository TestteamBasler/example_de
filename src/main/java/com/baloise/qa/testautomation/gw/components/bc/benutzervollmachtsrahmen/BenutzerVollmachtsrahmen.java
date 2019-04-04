package com.baloise.qa.testautomation.gw.components.bc.benutzervollmachtsrahmen;


import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class BenutzerVollmachtsrahmen extends AGWComponent {

  @ByXpath("//a[contains(@id,':Finish')]")
  private BrLink fertig;
  
  public void selectFertig() {
	  fill();
	  fertig.click();
  }

}
