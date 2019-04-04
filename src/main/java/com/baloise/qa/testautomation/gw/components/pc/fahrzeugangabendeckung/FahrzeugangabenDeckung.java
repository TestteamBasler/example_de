package com.baloise.qa.testautomation.gw.components.pc.fahrzeugangabendeckung;

import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCheckbox;
import org.open.insurance.baloise.qa.ui.taf.gw.elements.GWCombobox;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ById;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Fill;
import com.baloise.testautomation.taf.browser.elements.BrElement;
import com.baloise.testautomation.taf.browser.elements.BrLink;

@DataProvider(DataProviderType.EXCEL)
public class FahrzeugangabenDeckung extends AGWComponent {

  // Sektion Leistungspaket und Auswahl CHeckboxen
  @Fill(30)
  @ByXpath("//table[contains(@id,':PFVehicleDefaultGrp:PFVehicleCoverages_ExtDV_ref-table')]//div[text()='Kasko']/..//input[1]")
  public GWCheckbox kasko;
 
  // Sektion Haftpflicht 
  @Fill(110)
  @ByXpath("//div[text()='Haftpflicht Grunddeckung']/../..//span[text()='Deckungssumme']/../..//input[1]")
  public GWCombobox haftgrunddeckungssumme;
  
  // Sektion PF Vollkasko 
  @Fill(200)
  @ByXpath("//div[text()='Vollkasko Grunddeckung']/../..//span[text()='Selbstbehalt']/../..//input[1]")
  public GWCombobox vollgrundselbstbehalt;
  
  // Sektion Teilkasko
  @Fill(320)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Selbstbehalt']/../..//input[1]")
  public GWCombobox teilgrundselbstbehalt;
  
  @Fill(330)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Deckungssumme nicht werksseitig eingebautes Zubehör']/../..//input[1]")
  public GWCombobox teilgrundzubehoer;
  
  @Fill(340)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Neuwertentschädigung']/../..//input[1]")
  public GWCombobox teilgrundneuentsch;
  
  @Fill(350)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Kaufwertentschädigung*']/../..//input[1]")
  public GWCombobox teilgrundkaufentsch;
  
  @Fill(360)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Tierbiss an Verkabelung, Schläuchen und Dämmmaterial']/../..//input[1]")
  public GWCombobox teilgrundtierbiss;
  
  @Fill(370)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Zusammenstoß mit Tieren aller Art. In der TK bei Pkw']/../..//input[1]")
  public GWCombobox teilgrundkollision;

  @Fill(470)
  @ByXpath("//div[text()='Teilkasko Grunddeckung']/../..//span[text()='Werkstattwahl']/../..//input[1]")
  public GWCombobox teilgrundwerkwahl;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:CoverableDetailCardTab')]")
  public BrElement detailstab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:VehicleDriversCardTab')]")
  public BrElement fahrertab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:CoveragesCardTab')]")
  public BrElement deckungentab;
  
  @ByXpath("//a[contains(@id,':PFVehicle_BdePanelSet:CoverableDetailsCV:SFRTab')]")
  public BrElement sfrtab;  
  
  @ById("SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PFVehicle_ExtScreen:JobWizardToolbarButtonSet:QuoteOrReview")
  public BrLink angebot;
  
  @ById("SubmissionWizard:Next")
  public BrLink weiter;
  
  
  
  public void füllenUndAngebot() {
    deckungentab.click();
    fill();
    angebot.click();
    // Wegen fehlender Regionalklassen doppelt
    angebot.click();
  }
  
  public void deckungenfuellen() {
    deckungentab.click();
    fill();
  }

}