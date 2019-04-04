package com.baloise.qa.testautomation.gw.base;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.RuleChain;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager.TestcaseManager;
import org.openqa.selenium.WebDriver;

import com.baloise.testautomation.taf.base._base.ABase;

@TestcaseManager(GWTestcaseManager.class)
public abstract class AGWTest extends ABase {
  // global im Test gespeicherte Daten für Zeitreise
  private String timetravelyear = "undefined";

  // Setzt das Zeitreisejahr
  public void setTimeTravelYear (String year) {
	timetravelyear = year;
  }
  
  // gibt das Zeitreisejahr zurück
  public String getTimeTravelYear (boolean full) {
	if (full || timetravelyear.length() > 4) {
	  return timetravelyear;
	}
	return timetravelyear.substring(2);
  }

  @ClassRule
  public static GWClassWatcher classWatcher = new GWClassWatcher("target\\");

  public GWRuleChain gwRuleChain = new GWRuleChain(classWatcher);

  @Rule
  public RuleChain gwRules = gwRuleChain.getRules();

  public WebDriver getGWDriver() {
    return getManager().getGWFinder().getDriver();
  }

  public GWTestcaseManager getManager() {
    return (GWTestcaseManager)gwRuleChain.getManager();
  }

}
