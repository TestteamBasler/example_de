package com.baloise.qa.testautomation.gw.components.pc.jobcomplete;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrLabel;


@DataProvider(DataProviderType.EXCEL)
public class JobComplete extends AGWComponent {

  @Check(10)
  @ById("JobComplete:JobCompleteScreen:ttlBar")
  public BrLabel antragverbindlichgemacht;


}
