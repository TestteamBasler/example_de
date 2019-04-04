package com.baloise.qa.testautomation.gw.components.bc.zeitreise;

import java.time.LocalDate;
import java.time.Period;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.qa.testautomation.gw.base.AGWTest;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class Zeitreise extends AGWComponent {

  @Fill(10)
  @ById("dummy")
  public BrStringInput solldatum;
  
  @ByXpath("//span[@id='Admin:CurrentDateInfoBar:CurrentDate-btnInnerEl']/span[2]")
  public BrLabel aktdatum;
  
  @ById("InternalToolsTabBar:UnsupportedToolsTab")
  public BrLink tools;
  
  @ById("UnsupportedTools:MenuLinks:UnsupportedTools_SystemClock")
  public BrElement systemuhr;
  
  @ById("SystemClock:SystemClockScreen:SystemClock_AddDayButton")
  public BrLink addday;
  
  @ById("SystemClock:SystemClockScreen:SystemClock_AddWeekButton")
  public BrLink addweek;
  
  @ById("SystemClock:SystemClockScreen:SystemClock_AddMonthButton")
  public BrLink addmonth;
  
  @ById(":TabLinkMenuButton")
  private BrLink zahnrad;

  @ById("InternalToolsTabBar:ReturnTabBarLink-itemEl")
  private BrLink zurueckzucenter;

  @Override
  public void fill() {
	if (!(solldatum.fillValue().isSkip() || solldatum.fillValue().isEmpty() || solldatum.fillValue().isNull())) {
	  // Datumsberechnung durchführen
	  String aktual = aktdatum.get().asString();
	  String[] aktarr = aktual.split("\\."); 
	  String[] sollarr = solldatum.fillValueAsString().split("\\."); 
	  LocalDate aktualdate = LocalDate.of(Integer.parseInt(aktarr[2]), Integer.parseInt(aktarr[1]), Integer.parseInt(aktarr[0]));
	  LocalDate solldate = LocalDate.of(Integer.parseInt(aktarr[2]), Integer.parseInt(sollarr[1]), Integer.parseInt(sollarr[0]));
	  Period diff = Period.between(aktualdate, solldate);
	  if (!diff.isZero()) {
		if (diff.isNegative()) {
		  // Die Zeitreise erfolgt ins nächste Jahr
		  solldate = LocalDate.of(Integer.parseInt(aktarr[2])+1, Integer.parseInt(sollarr[1]), Integer.parseInt(sollarr[0]));
		  diff = Period.between(aktualdate, solldate);
		}
		// Nun wird gereist
	    Actions a = new Actions(solldatum.getDriver());
	    a.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("t").keyUp(Keys.SHIFT).keyUp(Keys.ALT).build().perform();
	    tools.click();
	    systemuhr.click();
		
	    int count = diff.getDays();
	    while (count > 6) {
	      addweek.click();
	      count -= 7;
	    }
	    while (count > 0) {
	      addday.click();
	      count--;
	    }
	    count = diff.getMonths();
	    while (count > 0) {
	      addmonth.click();
	      count--;
	    }
		/*if (diff.getDays() > 0) {
		  System.out.println(diff.getDays()+" Tage zu reisen");
		}
		if (diff.getMonths() > 0) {
		  System.out.println(diff.getMonths()+" Monate zu reisen");
		}*/
	    zahnrad.click();
	    zurueckzucenter.click();
	  }
	  
	  // Das Soll-Jahr speichern, um andere Datumseingaben auf das Jahr der Zeitreise anzupassen 
	  AGWTest root = (AGWTest)findFirstParent(AGWTest.class);
	  root.setTimeTravelYear(String.valueOf(solldate.getYear()));
	  //System.out.println("Jahr für Datenfelder " + solldate.getYear());
	}
  }
  
}
