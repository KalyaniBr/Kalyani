package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C5_MyACC {

	@FindBy(xpath="//span[text()=' My profile ']")WebElement Myprofile;
	@FindBy(xpath="//span[text()='Sign out']")WebElement SignOut;

	
	C5_MyACC(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonMyProfile() 
	{
		Myprofile.click();
	}
	public void clickSignout() 
	{
		SignOut.click();
	}
	
}
