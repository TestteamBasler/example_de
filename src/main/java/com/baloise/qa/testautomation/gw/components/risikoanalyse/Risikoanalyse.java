package com.baloise.qa.testautomation.gw.components.risikoanalyse;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrElement;

@DataProvider(DataProviderType.EXCEL)
public class Risikoanalyse extends AGWComponent {
  
  @ById("SubmissionWizard:Job_RiskAnalysisScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl")
  public BrElement angebot;
  
  @ById("SubmissionWizard:Next-btnInnerEl")
  public BrElement weiter;

}