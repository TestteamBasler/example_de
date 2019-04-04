package com.baloise.qa.testautomation.gw.components.bc.kontensuche;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;


@DataProvider(DataProviderType.EXCEL)
public class KontenSuche extends AGWComponent {

  @Fill(110)
  @ByXpath("//input[contains(@id,':AccountSearchScreen:AccountSearchDV:ContactCriteriaInputSet:GlobalPersonNameInputSet:FirstName-inputEl')]")
  public BrStringInput vorname;
    
  @Fill(120)
  @ByXpath("//input[contains(@id,':AccountSearchScreen:AccountSearchDV:ContactCriteriaInputSet:GlobalPersonNameInputSet:LastName-inputEl')]")
  public BrStringInput nachname;
    
  @ByXpath("//a[contains(@id,':AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search')]")
  private BrLink suchen;
  
  @ByXpath("//div[contains(@id,':AccountSearchScreen:AccountSearchResultsLV-body')]//tr[1]//a")
  private BrLink ersteskontoauswaehlen;
  
  public void fuellenSuchenUndAuswaehlen() {
	  fill();
	  suchen.click();
	  ersteskontoauswaehlen.click();
  }

}
