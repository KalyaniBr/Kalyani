package POM_DDF_TestNG_Utilitylass_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P5_MyACC 
{

 
 @FindBy(xpath="//span[text()=' My profile ']")private WebElement Myprofile;

  @FindBy(xpath="//span[text()='Sign out']")private WebElement Logout;


 P5_MyACC(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
	 
 }
 
 
 public void ClickOnMyProfile() 
 {
	Myprofile.click();
}
 public void ClickOnLogout()
 {
	
	 Logout.click();
	 
}
 
 
 
 
 
}
