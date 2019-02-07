package com.baloise.qa.testautomation.gw.components.schadensfallspeichern;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class SchadensfallSpeichern extends AGWComponent {

  @ById("FNOLWizard:Finish")
  public BrElement fertigstellen;

}