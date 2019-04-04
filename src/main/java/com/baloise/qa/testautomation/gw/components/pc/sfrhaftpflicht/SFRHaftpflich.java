
package com.baloise.qa.testautomation.gw.components.pc.sfrhaftpflicht;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class SFRHaftpflich extends AGWComponent {

  @ByXpath("//div[text()='<leer>'][1]")
  private BrElement ele;
  
  @ById("PolicySFR_ExtPopup:Update")
  private BrLink ok;
		  
  public void jahrAuswahlUndOK(String sjahr) {
    ele.click();
    try {
      //auswahltree.find().
      getBrowserFinder().getDriver().findElement(By.xpath("//li[text()='" + sjahr + "']")).click();
	} catch (NoSuchElementException e) {
	  assertTrue ("Jahr-Auswahl '" + sjahr + "' ist nicht vorhanden", false); 
	}
    ok.click();
  }
  
}
