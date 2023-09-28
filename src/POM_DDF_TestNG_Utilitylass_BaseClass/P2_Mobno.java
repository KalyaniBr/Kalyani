package POM_DDF_TestNG_Utilitylass_BaseClass;
import org.openqa.selenium.devtools.v113.page.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Mobno {
  @FindBy(xpath="(//input[@type='number'])[2]")private WebElement MOB;
 
  @FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SinginwithPWD;
 
 P2_Mobno(WebDriver  driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void EnterMOBno(String MOBno) 
 {
	MOB.sendKeys(MOBno);
}
 public void clickonSinginwithPWD() 
 {
	 SinginwithPWD.click();
}

}
