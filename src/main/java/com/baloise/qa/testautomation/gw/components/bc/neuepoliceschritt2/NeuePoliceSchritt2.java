package com.baloise.qa.testautomation.gw.components.bc.neuepoliceschritt2;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWPopupStingInput;
import org.openqa.selenium.By;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;


@DataProvider(DataProviderType.EXCEL)
public class NeuePoliceSchritt2 extends AGWComponent {

  @Fill(10)
  @ByXpath("//input[@name='ChargeGroup']")
  public GWPopupStingInput typ;

  @Fill(50)
  @ByXpath("//input[@name='Amount']")
  public GWPopupStingInput betrag;
  
  @ByXpath("//a[contains(@id,':Finish')]")
  private BrLink fertig;
  
  @ByXpath("//a[contains(@id,':Cancel')]")
  private BrLink abbrechen;
  
  @ByXpath("//a[contains(@id,'NewPolicyWizard:NewPolicyWizardChargeStepScreen:PolicyAddChargesLV_tb:Add')]")
  private BrLink hinzufuegen;
  
  @Override
  public void fill() {
	if (!(typ.fillValue().isSkip() || typ.fillValue().isEmpty() || typ.fillValue().isNull())) {
	  getBrowserFinder().getDriver().findElement(By.xpath("//div[@id='NewPolicyWizard:NewPolicyWizardChargeStepScreen:PolicyAddChargesLV-body']/div[1]/div[1]/table[1]/tbody/tr[last()]/td[2]")).click();
	  typ.fill();
	}
	  
	if (!(betrag.fillValue().isSkip() || betrag.fillValue().isEmpty() || betrag.fillValue().isNull())) {
	  getBrowserFinder().getDriver().findElement(By.xpath("//div[@id='NewPolicyWizard:NewPolicyWizardChargeStepScreen:PolicyAddChargesLV-body']/div[1]/div[1]/table[1]/tbody/tr[last()]/td[6]")).click();
	  betrag.fill();
	}
		  
  }
  
  public void fuellenUndFertig() {
	hinzufuegen.click();
	fill();
	fertig.click();
  }

}
