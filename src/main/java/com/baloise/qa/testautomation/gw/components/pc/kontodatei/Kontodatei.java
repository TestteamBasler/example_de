package com.baloise.qa.testautomation.gw.components.pc.kontodatei;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrLabel;


@DataProvider(DataProviderType.EXCEL)
public class Kontodatei extends AGWComponent {

  @Check(10)
  @ByXpath("//div[contains(@id,':AccountFile_Summary_BasicInfo_BdeDV:Name-inputEl')]")
  public BrLabel kundenkontoname;

  @Check(20)
  @ByXpath("//div[contains(@id,':AccountFile_Summary_BasicInfo_BdeDV:AccountStatus-inputEl')]")
  public BrLabel status;
 
}
