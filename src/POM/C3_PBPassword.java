package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C3_PBPassword {

	@FindBy(xpath="//input[@type='password']")WebElement PWD;
	
	@FindBy(xpath="//span[text()='Sign in']") WebElement SignIn;
	
	C3_PBPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPWD() {
		
		PWD.sendKeys("Mal@1234");
	}
	
	public void clickPBSignInButton() 
	{
		SignIn.click();
	}
	
}
