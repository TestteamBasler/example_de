package org.open.insurance.baloise.qa.ui.taf.gw.elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baloise.testautomation.taf.browser.elements.BrStringInput;

public class GWDateWithPickerInput extends BrStringInput {
  
  @Override
  public void fill() {
    if (canFill()) {
      WebElement input = find();
      input.click();
      Actions a = new Actions(getDriver());
      a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
      a.sendKeys(Keys.DELETE).release().perform();
      input.sendKeys(fillValueAsString());
      a.sendKeys(Keys.TAB).release().perform();
    }
  }

}
