package org.open.insurance.baloise.qa.ui.taf.gw.elements;

import com.baloise.qa.testautomation.gw.base.AGWTest;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

public class GWStringInputZR extends BrStringInput {
  
  @Override
  public void check() {
	if (canCheck()) {
	  String val = checkValueAsString();
	  this.setCheck(doZeitreise(val));
	}
	super.check();
  }
  
  @Override
  public void fill() {
	if (canFill()) {
	  String val = fillValueAsString();
	  this.setFill(doZeitreise(val));
	}
	super.fill();
  }
  
  private String doZeitreise (String val) {
	boolean full = val.contains("{ZRYYYY}");
	if (val.contains("{ZRYY}") || full) {
	  AGWTest root = (AGWTest)component.findFirstParent(AGWTest.class);
	  return val.replaceFirst("\\{ZRYY\\}|\\{ZRYYYY\\}", root.getTimeTravelYear(full));
	}
	return val;
  }

}
