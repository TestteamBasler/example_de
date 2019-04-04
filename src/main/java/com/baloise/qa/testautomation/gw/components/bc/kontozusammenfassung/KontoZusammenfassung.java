package com.baloise.qa.testautomation.gw.components.bc.kontozusammenfassung;

import org.openqa.selenium.By;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class KontoZusammenfassung extends AGWComponent {
  
  @Fill(10)
  @ById("Dummy")
  private BrStringInput selectpolice;
  
  @Override
  public void fill() {
	if (!(selectpolice.fillValue().isSkip() || selectpolice.fillValue().isEmpty() || selectpolice.fillValue().isNull())) {
	  getBrowserFinder().getDriver().findElement(By.xpath("//a[text()='" + selectpolice.fillValueAsString() + "']")).click();
	}
  }
}
