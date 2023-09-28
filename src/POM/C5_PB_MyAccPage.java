package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C5_PB_MyAccPage {

	@FindBy(xpath="//span[text()=' My profile ']") WebElement MyProfile;
	
	@FindBy(xpath="//span[text()='Sign out']")WebElement SignOut;
	
	C5_PB_MyAccPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void ClickPBMyProfile() 
	{
		MyProfile.click();
	}
	public void ClickOnSignOut () 
	{
		SignOut.click();
	}
}
