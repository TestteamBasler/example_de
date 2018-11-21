package com.baloise.qa.testautomation.gw.components.login;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrButton;
import com.baloise.testautomation.taf.browser.elements.BrStringInput;

@DataProvider(DataProviderType.EXCEL)
public class Login extends AGWComponent {

  @Fill(10)
  @ById("Login:LoginScreen:LoginDV:username-inputEl")
  public BrStringInput benutzername;

  @Fill(20)
  @ById("Login:LoginScreen:LoginDV:password-inputEl")
  public BrStringInput passwort;

  @ById("Login:LoginScreen:LoginDV:submit")
  public BrButton anmelden;

  @Override
  public void fill() {
	  super.fill();
	  
	  anmelden.click();
  }
}
