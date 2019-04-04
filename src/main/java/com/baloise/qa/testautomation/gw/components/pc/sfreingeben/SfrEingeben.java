package com.baloise.qa.testautomation.gw.components.pc.sfreingeben;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class SfrEingeben extends AGWComponent {

  //@Fill(10)
  @ByXpath("//div[@id='PolicySFR_ExtPopup:AccountSFRDetails_ExtPanelSet:AccountSFRDetails_ExtCV:AccountSFRPeriods_ExtLV']//table[@data-recordindex='0']//tr//td[1]")
  public BrElement sichtjahr;
  
  //@Fill(20)
  @ByXpath("//div[contains(@class, 'boundlist') and not(contains(@style, 'display: none'))]//div//ul//li[contains(text(), '2018')]")
  public BrElement sichtjahrwahl;
  
  @ById("PolicySFR_ExtPopup:Update-btnInnerEl")
  public BrElement ok;
  
  public void sfrfuellen() {
    //fill();
    sichtjahr.click();
    sichtjahrwahl.click();
    ok.click();
  }

}