package com.baloise.qa.testautomation.gw.components.sfreingeben;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class SfrEingeben extends AGWComponent {

  //@Fill(10)
  //@ByXpath("//table[@id='PolicySFR_ExtPopup:AccountSFRDetails_ExtPanelSet:AccountSFRDetails_ExtCV:PeriodDetailsTab:panelId-table']/tbody/tr/td/div/table/tbody/tr[1]/td[1]/div")
  @Fill(10)
  @ByXpath("//td[@columnid='gridcolumn-1743']")
  public BrStringInput sichtjahr;
  
  @ById("PolicySFR_ExtPopup:Update-btnInnerEl")
  public BrElement ok;
  
  public void sfrfuellen() {
    fill();
    ok.click();
  }

}