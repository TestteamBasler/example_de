package com.baloise.qa.testautomation.gw.components.pc.werkzeugmenue;

import org.openqa.selenium.Keys;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

public class WerkzeugMenue extends AGWComponent {

  @ById(":TabLinkMenuButton")
  private BrLink zahnrad;
  
  @ByXpath("//a/span[contains (text(), 'Sprache')  or contains (text(), 'Language')]/..")
  private BrLink sprache;
  
  @ByXpath("//a/span[contains (text(), 'Deutsch')]/..")
  private BrLink deutsch;
  
  @ByXpath("//div[contains(@id,':LanguageSwitcherTabBarLink:1:langs-checkEl')]/..")
  private BrLink deutschflag;
  
  @ByXpath("//a/span[contains (text(), 'English')]/..")
  private BrLink englisch;
  
  @ByXpath("//div[contains(@id,':LanguageSwitcherTabBarLink:0:langs-checkEl')]/..")
  private BrLink englischflag;
  
  //@ByXpath("//a/span[contains (text(), 'Abmelden') or contains (text(), 'Log Out')]/..")
  @ByXpath("//a[contains(@id,':LogoutTabBarLink-itemEl')]")
  private BrLink logout;
  
  @ByXpath("//a[contains(@id,'button-1005')]")
  private BrLink logoutconfirmbutton;
  
  @ById("Login:LoginScreen:LoginDV:username-inputEl")
  public BrStringInput benutzername;
  
  public void setToDeutsch () {
  zahnrad.click();
  sprache.click();
  sprache.find().sendKeys(Keys.RIGHT);
  deutsch.click();
  }
  
  public void setToEnglisch () {
  zahnrad.click();
  sprache.click();
  sprache.find().sendKeys(Keys.RIGHT);
  englisch.click();
  }
  
  public void logout() {
  zahnrad.click();
  logout.click();
  if (logoutconfirmbutton.exists()){
    logoutconfirmbutton.click();
  }
  }
  
  public void logoutAndCheck() {
  zahnrad.click();
  logout.click();
  if (logoutconfirmbutton.exists()){
    logoutconfirmbutton.click();
  }
  // Prüfen, ob man in der Anmeldemaske gelandet ist.
    getBrowserFinder().waitUntilLoadingComplete();
    benutzername.find();
  }
  
}
