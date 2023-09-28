package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C2_PBUsername {

	
	 @FindBy(xpath="(//input[@type='number'])[2]") WebElement Username ;
	 @FindBy(xpath="(//span[text()='Sign in with Password'])[2]") WebElement SignInwithPWD ;

	
	 C2_PBUsername(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	public void PBUsername() 
	{
		Username.sendKeys("9604893245");
	}
	
	public void clickonsigninwithPWDbutton()
	{
		SignInwithPWD.click();
	}
	
	
	
}
