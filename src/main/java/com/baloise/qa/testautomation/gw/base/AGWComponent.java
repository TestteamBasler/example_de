package com.baloise.qa.testautomation.gw.base;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.open.insurance.baloise.qa.ui.taf.gw.finder.GWBrFinder;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baloise.testautomation.taf.base._base.ABase;
import com.baloise.testautomation.taf.base._base.AElement;
import com.baloise.testautomation.taf.browser.elements.ABrInput;
import com.baloise.testautomation.taf.browser.elements.BrElement;

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

  public void existText(BrElement ele, String text) {
	getBrowserFinder().waitUntilLoadingComplete();
	
	Long timeoutInMsecs = getBrowserFinder().getTimeoutInMsecs();
	try {
	  getBrowserFinder().setTimeoutInMsecs(200L);
	  ele.find().findElement(By.xpath("//a[text()='" + text + "']"));
	} catch (NoSuchElementException e) {
	  fail ("Element '" + text + "' nicht gefunden"); 
	} finally {
	  getBrowserFinder().setTimeoutInMsecs(timeoutInMsecs);
	}
  }
  
  protected boolean existTableText(BrElement ele, String text) {
	Long timeoutInMsecs = getBrowserFinder().getTimeoutInMsecs();
	boolean retvalue = false;
	try {
	  getBrowserFinder().setTimeoutInMsecs(200L);
	  ele.find().findElement(By.xpath("//a[text()='" + text + "']"));
	  retvalue = true;
	} catch (NoSuchElementException e) {
	  // Keine Exeption
	} finally {
	  getBrowserFinder().setTimeoutInMsecs(timeoutInMsecs);
	}
	return retvalue;
  }
  
  public void existMultiTableText(BrElement ele, String text) {
	getBrowserFinder().waitUntilLoadingComplete();
	
	Long timeoutInMsecs = getBrowserFinder().getTimeoutInMsecs();
	boolean multi = false;
	boolean found = false;

	// schaue, ob es mehrere Seiten gibt
	WebElement firstPage = null;
	WebElement nextPage = null;
	String classText;
	try {
	  getBrowserFinder().setTimeoutInMsecs(200L);
	  firstPage = ele.find().findElement(By.xpath("//a[@data-qtip='Erste Seite']"));
	  nextPage = ele.find().findElement(By.xpath("//a[@data-qtip='Nächste Seite']"));
	  multi = true;
	} catch (NoSuchElementException e) {
	  // Keine Exeption
	} finally {
	  getBrowserFinder().setTimeoutInMsecs(timeoutInMsecs);
	}
	
	if (multi) {
	  // auf 1. Seite navigieren
	  firstPage.click();
	  getBrowserFinder().waitUntilLoadingComplete();
	  
	  // Schleife über alle Seiten und suchen
	  classText = nextPage.getAttribute("class");
	  while (!found && !classText.contains("x-btn-disabled")) {
		found = existTableText(ele, text);
		if (!found) {
		  nextPage.click();
		  getBrowserFinder().waitUntilLoadingComplete();
		  classText = nextPage.getAttribute("class");
		}
	  }
	  
	  // Zurück auf 1. Seite (konsitenter Zustant)
	  firstPage.click();
	  
	  // Meldung, wenn nicht gefunden
	  if (!found) {
		fail ("Element '" + text + "' nicht gefunden"); 
	  }
	  
	  
	} else {
	  // Aufruf ohne Schleife
	  existText(ele, text);
	}
	
  }
  
  public boolean checkErrorMessage() {
  Long timeoutInMsecs = getBrowserFinder().getTimeoutInMsecs();
  boolean retvalue = false;
  try {
    getBrowserFinder().setTimeoutInMsecs(200L);
    getBrowserFinder().getDriver().findElements(By.xpath("//img[contains(@class, 'error_icon')]"));
    retvalue = true;
    logger.info("Error Message was found");
  } catch (NoSuchElementException e) {
    // Keine Exeption
  } finally {
    getBrowserFinder().setTimeoutInMsecs(timeoutInMsecs);
  }
  return retvalue;
  }
  
//  public String getErrorMessage() {
//  Long timeoutInMsecs = getBrowserFinder().getTimeoutInMsecs();
//  String retvalue = "";
//  try {
//    getBrowserFinder().setTimeoutInMsecs(200L);
//    getBrowserFinder().getDriver().findElements(By.xpath("//div[contains(@class, 'message')]"));
//    logger.info("Error Message was found");
//  } catch (NoSuchElementException e) {
//    // Keine Exeption
//  } finally {
//    getBrowserFinder().setTimeoutInMsecs(timeoutInMsecs);
//  }
//  return retvalue;
//  }
  
  public void checkErrorMessagePresence() {
  boolean errorMesFound = checkErrorMessage();
  if (!errorMesFound) {
    fail ("Error message was not generated, Control failed"); 
    }
  }
  
  public void checkErrorMessageAbsence() {
    boolean errorMesFound = checkErrorMessage();
    if (errorMesFound) {
      fail ("Error message was generated, Filling failed"); 
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

  public void hoverTo(AElement element) {
	    getBrowserFinder().waitUntilLoadingComplete();
	    WebElement we = (WebElement) element.find();
	    new Actions(getBrowserFinder().getDriver()).moveToElement(we).perform();
	  }

  public void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    }
    catch (Exception e) {}
  }

}
