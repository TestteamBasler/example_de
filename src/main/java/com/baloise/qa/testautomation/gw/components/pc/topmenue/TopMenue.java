package com.baloise.qa.testautomation.gw.components.pc.topmenue;

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
  
  @ById("TabBar:AccountTab")
  private BrLink kontotab;
  
  @ById("TabBar:AccountTab:AccountTab_NewAccount-itemEl")
  private BrLink neueskonto;

  @Fill(310)
  @ById("TabBar:AccountTab:AccountTab_AccountNumberSearchItem-inputEl")
  private BrStringInput kontonummer;
  
  @ById("TabBar:PolicyTab")  
  private BrLink policetab;

  @ById("TabBar:PolicyTab:PolicyTab_NewSubmission-itemEl")  
  private BrLink neuerantrag;
  
  @ById("TabBar:ClaimTab")  
  private BrLink claimtab;

  @ById("TabBar:ClaimTab:ClaimTab_FNOLWizard-itemEl")  
  private BrLink neuerschadensfall;
  
  @ById("TabBar:ContactTab")  
  private BrLink kontakttab;
  
  @ById("TabBar:ContactTab:NewContact-itemEl")  
  private BrLink neuerkontakt;
  
  @ById("TabBar:ContactTab:NewContact:NewCompany-itemEl")  
  private BrLink neuesunternehmen;
  
  @ById("TabBar:ContactTab:NewContact:NewPerson-itemEl")  
  private BrLink neueperson;
  
  @Fill(310)
  @ById("TabBar:PolicyTab:PolicyTab_SubmissionNumberSearchItem-inputEl")
  private BrStringInput antragnummer;
  
  @ById("TabBar:AdminTab")
  private BrLink verwaltungtab;
  
  public void selectDesktopPage() {
  desktoptab.click();
  }
  
  public void selectKontoPage() {
  kontotab.click();
  }
  
  public void selectPolicyPage() {
  policetab.click();
  }
  
  public void selectMenueNeuerAntrag() {
  policetab.find().sendKeys(Keys.DOWN);
  neuerantrag.click();
  }
  
  public void selectMenueNeuerKontakt() {
    kontakttab.find().sendKeys(Keys.DOWN);
    neuerkontakt.click();
    neuerkontakt.find().sendKeys(Keys.RIGHT);
    neuesunternehmen.find().sendKeys(Keys.DOWN);
    neueperson.click();
    }
  
  public void selectMenueNeuerSchadensfall() {
    claimtab.find().sendKeys(Keys.DOWN);
    neuerschadensfall.click();
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
  
  public void selectNeuesKonto () {
  kontotab.find().sendKeys(Keys.DOWN);
  neueskonto.click();
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
  
  public void selectVerwaltungPage () {
  verwaltungtab.click();
  }
}
