package com.baloise.qa.testautomation.gw.components.bc.topmenue;

import org.openqa.selenium.Keys;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class TopMenue extends AGWComponent {
  
  @ById("TabBar:DesktopTab")
  private BrLink desktoptab;
  
  @ById("TabBar:AccountsTab")
  private BrLink kontotab;
  
  @ById("TabBar:AccountsTab:0:AccountSessionItemId-itemEl")
  private BrLink ersteskonto;
  
  @Fill(310)
  @ById("TabBar:AccountsTab:AccountNumberSearchItem-inputEl")
  private BrStringInput kontonummer;
  
  @ById("TabBar:PoliciesTab")  
  private BrLink policetab;

  @Fill(310)
  @ById("TabBar:PoliciesTab:PolicyNumberSearchItem-inputEl")
  private BrStringInput antragnummer;
  
  @ById("TabBar:SearchTab")
  private BrLink suchentab;
  
  @ById("TabBar:SearchTab:SearchGroup_InvoiceSearch-itemEl")
  private BrLink suchenrechnung;
  
  @ById("TabBar:AdministrationTab")
  private BrLink verwaltungtab;
  
  public void selectDesktopPage() {
	desktoptab.click();
  }
  
  public void selectKontoPage() {
	kontotab.click();
  }
  
  public void selectErstesKonto() {
	kontotab.find().sendKeys(Keys.DOWN);
	ersteskonto.click();
  }
  
  public void selectPolicyPage() {
	policetab.click();
  }
  
  @Override
  public void fill() {
	if (!kontonummer.fillValue().isSkip()) {
	  fillkonto();
	}
	  
	if (!antragnummer.fillValue().isSkip()) {
	  fillantrag();
	}
  }
  
  private void fillkonto() {
	kontotab.find().sendKeys(Keys.DOWN);
	kontonummer.fill();
	kontonummer.find().sendKeys(Keys.ENTER);
  }
  
  private void fillantrag() {
	policetab.find().sendKeys(Keys.DOWN);
	antragnummer.fill();
	antragnummer.find().sendKeys(Keys.ENTER);
  }
  
  public void selectSuchenRechnung() {
	suchentab.find().sendKeys(Keys.DOWN);
	suchenrechnung.click();
  }
  
  public void selectVerwaltungPage () {
	verwaltungtab.click();
  }
}
