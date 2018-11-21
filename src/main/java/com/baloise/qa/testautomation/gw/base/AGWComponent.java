package com.baloise.qa.testautomation.gw.base;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.open.insurance.baloise.qa.ui.taf.gw.finder.GWBrFinder;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baloise.testautomation.taf.base._base.ABase;
import com.baloise.testautomation.taf.browser.elements.ABrInput;

/**
 * 
 */
public abstract class AGWComponent extends ABase {

  public static Logger logger = LoggerFactory.getLogger("AGWComponent");

  public void clickMenu(String menu) {
    String[] menus = menu.split("->");
    for (int i = 0; i < (menus.length - 1); i++) {
      hoverTo(menus[i]);
    }
    clickText(menus[menus.length - 1]);
  }

  public void clickText(String text) {
    getWithText(text).click();
  }

  public void clickText(String text, int index) {
    try {
      getBrowserFinder().getDriver().findElements(By.linkText(text)).get(index).click();
    }
    catch (Exception e) {
      fail("Element mit index = " + index + " nicht gefunden/geklickt");
    }
  }

  protected void fillOrAction(ABrInput input) {
    if ("{notvisible}".equalsIgnoreCase(input.fillValueAsString())) {
      Long timeoutInMsecs = getBrowserFinder().getTimeoutInMsecs();
      try {
        getBrowserFinder().setTimeoutInMsecs(200L);
        input.find();
      }
      catch (Throwable e) {
        return;
      }
      finally {
        getBrowserFinder().setTimeoutInMsecs(timeoutInMsecs);
      }
      Assert.fail("Element gefunden, obwohl sie nicht sichtbar sein sollte:" + input);
    }
    input.fill();
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

  private WebElement getWithText(String text) {
    return getBrowserFinder().getDriver().findElement(
        By.xpath("//span[contains(@class, 'x-menu-item-text') and contains(text(), '" + text + "')]/../.."));
  }

  public void hoverTo(String text) {
    getBrowserFinder().waitUntilLoadingComplete();
    WebElement we = getWithText(text);
    new Actions(getBrowserFinder().getDriver()).moveToElement(we).perform();
  }

  public void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    }
    catch (Exception e) {}
  }

}
