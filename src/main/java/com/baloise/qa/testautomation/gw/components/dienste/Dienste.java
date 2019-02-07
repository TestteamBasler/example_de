package com.baloise.qa.testautomation.gw.components.dienste;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class Dienste extends AGWComponent {

  @ById("FNOLWizard:Next")
  public BrElement weiter;

}