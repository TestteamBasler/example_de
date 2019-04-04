package com.baloise.qa.testautomation.gw.components.bc.rechnungsuchen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWStringInputZR;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;


@DataProvider(DataProviderType.EXCEL)
public class RechnungSuchen extends AGWComponent {
  @Fill(20)
  @Check(20)
  @ById("InvoiceSearch:InvoiceSearchScreen:InvoiceSearchDV:EarliestDateCriterion-inputEl")
  public GWStringInputZR fruehestesdatum;
    
  @Fill(30)
  @Check(30)
  @ById("InvoiceSearch:InvoiceSearchScreen:InvoiceSearchDV:LatestDateCriterion-inputEl")
  public GWStringInputZR neuestesdatum;

}
