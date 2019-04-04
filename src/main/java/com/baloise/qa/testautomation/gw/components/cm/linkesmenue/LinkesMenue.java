package com.baloise.qa.testautomation.gw.components.cm.linkesmenue;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrLink;

public class LinkesMenue extends AGWComponent {

  @ById("ABContacts:ContactsMenuActions")
  private BrLink action;

  @ById("ABContacts:ContactsMenuActions:ContactsMenuActions_NewPersonMenuItem-itemEl")
  private BrLink neueperson;

  @ById("ABContacts:ContactsMenuActions:ContactsMenuActions_NewPersonMenuItem:ContactsMenuActions_OtherPersonMenuItem-itemEl")
  private BrLink neuepersonperson;

  public void selectNeuePersonPerson() {
	action.click();
	//neueperson.click();
	hoverTo(neueperson);
	neuepersonperson.click();
  }
    
}
