package com.baloise.qa.testautomation.gw.components.pc.notizen;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWRadioButton;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;


@DataProvider(DataProviderType.EXCEL)
public class Notizen extends AGWComponent {

  @Fill(90)
  @ById("AccountFile_Notes:NotesScreen:NoteSearchDV:sortAscending_true-inputEl")
  public GWRadioButton aufsteigend;
  
  @Fill(100)
  @ById("AccountFile_Notes:NotesScreen:NoteSearchDV:sortAscending_false-inputEl")
  public GWRadioButton absteigend;
  
  @ById("AccountFile_Notes:NotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Reset")
  private BrLink zuruecksetzen;
  
  @ById("AccountFile_Notes:NotesScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
  private BrLink suchen;
  
  public void fuellenUndSuchen() {
	  zuruecksetzen.click();
	  fill();
	  suchen.click();
  }
  
  public void clickZuruecksetzen() {
	  zuruecksetzen.click();
  }
  
  public void clickSuchen() {
	  suchen.click();
  }
  
}
