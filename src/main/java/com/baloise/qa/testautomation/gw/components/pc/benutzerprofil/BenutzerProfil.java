package com.baloise.qa.testautomation.gw.components.pc.benutzerprofil;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrLink;


@DataProvider(DataProviderType.EXCEL)
public class BenutzerProfil extends AGWComponent {

  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetail_ProfileCardTab')]")
  private BrLink profil;
	  
  @Fill(90)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserProfileDV:GlobalizationPreferences:UserPreferencesInputSet:Language')]")
  public GWCombobox benutzersprache;
    
  @Fill(100)
  @ByXpath("//input[contains(@id,':UserDetailScreen:UserProfileDV:GlobalizationPreferences:UserPreferencesInputSet:RegionalFormats')]")
  public GWCombobox regionalesformat;
    
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Update')]")
  private BrLink aktualisieren;
  
  @ByXpath("//a[contains(@id,':UserDetailScreen:UserDetailToolbarButtonSet:Cancel')]")
  private BrLink abbrechen;
  
  public void fuellen() {
	  profil.click();
	  fill();
  }
  
  public void fuellenUndAnlegen() {
	  profil.click();
	  fill();
	  aktualisieren.click();
  }

}
