package com.baloise.qa.testautomation.gw.components.werkzeugmenue;

import org.openqa.selenium.Keys;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class WerkzeugMenue extends AGWComponent {

  @ById(":TabLinkMenuButton")
  private BrLink zahnrad;

  @ByXpath("//a/span[text()='International']/..")
  private BrLink international;
  
  @ById("TabBar:LanguageTabBarLink:languageSwitcher-itemEl")
  private BrLink sprache;
  
  @ByXpath("//a/span[contains (text(), 'Deutsch')]/..")
  private BrLink deutsch;
  
  @ByXpath("//a/span[contains (text(), 'English')]/..")
  private BrLink englisch;
  
  @ByXpath("//a/span[contains (text(), 'Abmelden ') or contains (text(), 'Log Out ')]/..")
  private BrLink logout;
  
  public void setToDeutsch () {
	  zahnrad.click();
	  international.click();
	  international.find().sendKeys(Keys.RIGHT);
	  sprache.click();
	  sprache.find().sendKeys(Keys.RIGHT);
	  deutsch.click();
  }
  
  public void setToEnglisch () {
	  zahnrad.click();
	  international.click();
	  international.find().sendKeys(Keys.RIGHT);
	  sprache.click();
	  sprache.find().sendKeys(Keys.RIGHT);
	  englisch.click();
  }
  
  public void logout() {
	  zahnrad.click();
	  logout.click();
  }
  
}
