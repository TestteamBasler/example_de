package com.baloise.qa.testautomation.gw.components.bc.zahlungszeitplan;

import com.baloise.qa.testautomation.gw.base.AGWComponent;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.ByXpath;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.Check;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProvider;
import com.baloise.testautomation.taf.base._interfaces.IAnnotations.DataProviderType;
import com.baloise.testautomation.taf.browser.elements.BrLabel;


@DataProvider(DataProviderType.EXCEL)
public class Zahlungszeitplan extends AGWComponent {

  @Check(3)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[1]/tbody/tr/td[3]/div")
  public BrLabel rechnung1;

  @Check(5)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[1]/tbody/tr/td[5]/div")
  public BrLabel faellig1;

  @Check(10)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[1]/tbody/tr/td[10]/div")
  public BrLabel betrag1;

  @Check(3)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[2]/tbody/tr/td[3]/div")
  public BrLabel rechnung2;

  @Check(5)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[2]/tbody/tr/td[5]/div")
  public BrLabel faellig2;

  @Check(20)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[2]/tbody/tr/td[10]/div")
  public BrLabel betrag2;

  @Check(30)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[3]/tbody/tr/td[10]/div")
  public BrLabel betrag3;

  @Check(40)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[4]/tbody/tr/td[10]/div")
  public BrLabel betrag4;

  @Check(50)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[5]/tbody/tr/td[10]/div")
  public BrLabel betrag5;

  @Check(60)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[6]/tbody/tr/td[10]/div")
  public BrLabel betrag6;

  @Check(70)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[7]/tbody/tr/td[10]/div")
  public BrLabel betrag7;

  @Check(80)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[8]/tbody/tr/td[10]/div")
  public BrLabel betrag8;

  @Check(90)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[9]/tbody/tr/td[10]/div")
  public BrLabel betrag9;

  @Check(100)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[10]/tbody/tr/td[10]/div")
  public BrLabel betrag10;

  @Check(110)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[11]/tbody/tr/td[10]/div")
  public BrLabel betrag11;

  @Check(120)
  @ByXpath("//div[@id='PolicyDetailPayments:PolicyDetailPaymentsScreen:InvoiceItemsLV-body']/div[1]/div[1]/table[12]/tbody/tr/td[10]/div")
  public BrLabel betrag12;
}
