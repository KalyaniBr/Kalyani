package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C3_Pwd {

	@FindBy(xpath="//input[@type='password']")WebElement PWD;
	
	@FindBy(xpath="//span[text()='Sign in']")WebElement SignInButton;

	C3_Pwd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void EnterPWD(String Pwd)
	{
		PWD.sendKeys(Pwd);
		
	}
	
	public void clicSignInButton() 
	{
		SignInButton.click();
	}
}
