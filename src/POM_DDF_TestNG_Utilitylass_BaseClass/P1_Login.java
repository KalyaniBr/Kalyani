package POM_DDF_TestNG_Utilitylass_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_Login {

	
	 @FindBy(xpath="//a[@class='sign-in']")private WebElement SignInbtn;
	
	P1_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClicOnSignInBtn() 
	{
		SignInbtn.click();
	}
	
	
	
}
