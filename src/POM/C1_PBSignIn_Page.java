package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C1_PBSignIn_Page {

	
	     @FindBy(xpath="//a[@class='sign-in']")private WebElement SignIn;
	
	     C1_PBSignIn_Page(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	
	public void PBClickOnSignInButton() 
	{
		SignIn.click();
	}
	
	
	
	
}

