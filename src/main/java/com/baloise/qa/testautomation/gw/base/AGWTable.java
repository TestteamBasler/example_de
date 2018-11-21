/*
 ===========================================================================
 @    $Author$
 @  $Revision$
 @      $Date$
 @
 ===========================================================================
 */
package com.baloise.qa.testautomation.gw.base;

import org.junit.Assert;
import org.open.insurance.baloise.qa.ui.taf.gw.finder.GWBrFinder;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;
import org.openqa.selenium.WebElement;

import com.baloise.testautomation.taf.base._base.ATable;

/**
 * 
 */
public abstract class AGWTable extends ATable {

  // @Override
  public WebElement find() {
    return getBrowserFinder().find(by);
  }

  @Override
  public GWBrFinder getBrowserFinder() {
    AGWTest root = (AGWTest)findFirstParent(AGWTest.class);
    Assert.assertNotNull("No root AGWTest found", root);
    IGWTestcaseManager manager = root.getManager();
    GWBrFinder finder = ((GWTestcaseManager)manager).getGWFinder();
    finder.assumeDriverAssigned();
    return finder;
  }

}
