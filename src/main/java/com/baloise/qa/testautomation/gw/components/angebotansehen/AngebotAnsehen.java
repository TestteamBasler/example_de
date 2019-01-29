package com.baloise.qa.testautomation.gw.components.angebotansehen;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrLabel;


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

}
