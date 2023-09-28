package POM_DDF_TestNG_Utilitylass_BaseClass;
import org.openqa.selenium.devtools.v113.page.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_Password {
 @FindBy(xpath="//input[@type='password']") private WebElement PWD;
 @FindBy(xpath="//span[text()='Sign in']")private WebElement Clickonsign;

P3_Password(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void EnterPWD(String Pwd)
{
	PWD.sendKeys(Pwd);
}
public void PWDClickOnSignIn()
{
	
	Clickonsign.click();
	
}





}
