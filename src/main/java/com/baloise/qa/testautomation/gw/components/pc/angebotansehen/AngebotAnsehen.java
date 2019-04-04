package com.baloise.qa.testautomation.gw.components.pc.angebotansehen;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLabel;
import com.baloise.testautomation.taf.browser.elements.BrLink;


@DataProvider(DataProviderType.EXCEL)
public class AngebotAnsehen extends AGWComponent {

  @Check(10)
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:JobNumber-inputEl")
  public BrLabel antragsnummer;

  @Check(20)
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyPeriod-inputEl")
  public BrLabel laufzeit;

  @Check(30)
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:Insured-inputEl")
  public BrLabel versicherungsnehmer;

  @Check(40)
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:PolicyAddress:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl")
  public BrLabel adresse;

  @Check(50)
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:Quote_SummaryDV:TotalPremium-inputEl")
  public BrLabel gesamtpraemie;
  
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions")
  public BrElement machungsoptionen;
  
  @ById("SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindAndIssue")
  public BrLink policeausstellen;
  
  @ById("button-1005")
  public BrElement okbutton;
  
  public void policeausstellen() {
    //machungsoptionen.click();
    policeausstellen.click();
    okbutton.click();
    // Wegen fehlender Regionalklassen doppelt
    policeausstellen.click();
    okbutton.click(); 
  }

}
