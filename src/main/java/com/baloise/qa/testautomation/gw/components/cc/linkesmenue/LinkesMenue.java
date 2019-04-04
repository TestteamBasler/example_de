package com.baloise.qa.testautomation.gw.components.cc.linkesmenue;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class LinkesMenue extends AGWComponent {

  @ById("Admin:AdminMenuActions")
  private BrElement adminaktionen;
  
  @ById("Admin:AdminMenuActions:AdminMenuActions_NewUser-itemEl")
  private BrLink newuser;
  
  @ById("Admin:MenuLinks:Admin_UsersAndSecurity")
  private BrElement benutzerundsichereheit;
  
  @ById("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_UserSearch")
  private BrElement benutzer;
  
  @ById("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_Groups")
  private BrLink gruppen;
  
  @ById("Admin:MenuLinks:Admin_UsersAndSecurity:UsersAndSecurity_Roles")
  private BrElement rollen;

  @ById("Admin:MenuLinks:Admin_BusinessSettings")
  private BrElement geschäftseinstellungen;
  
  @ById("Admin:MenuLinks:Admin_BusinessSettings:BusinessSettings_BillingPlans")
  private BrElement abrechnungsplaene;

  @ById("Admin:MenuLinks:Admin_BusinessSettings:BusinessSettings_PaymentPlans")
  private BrElement zahlungsplaene;

  public void selectBenutzer() {
	benutzerundsichereheit.click();
	benutzer.click();
  }
  
  public void selectGruppen() {
	benutzerundsichereheit.click();
    gruppen.click();
  }
  
  public void selectRollen() {
	benutzerundsichereheit.click();
	rollen.click();
  }
  
  public void selectAbrechnungsplaene() {
	geschäftseinstellungen.click();
	abrechnungsplaene.click();
  }
  
  public void selectZahlungsplaene() {
	geschäftseinstellungen.click();
	zahlungsplaene.click();
  }
  
  public void selectNewUser() {
	adminaktionen.click();
    newuser.click();
  }
  
}
