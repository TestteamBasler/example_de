package com.baloise.qa.testautomation.gw.components.bc.rollen;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.browser.elements.BrElement;

public class Rollen extends AGWComponent {

  @ById("Roles:RolesScreen:RolesLV-body")
  private BrElement rollentabelle;
  

  public void checkRolleExists (String rollenname) {
	existMultiTableText(rollentabelle, rollenname);
  }
  
}
