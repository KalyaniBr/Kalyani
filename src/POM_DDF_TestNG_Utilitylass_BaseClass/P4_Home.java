package POM_DDF_TestNG_Utilitylass_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P4_Home {

	 @FindBy(xpath="//div[text()='My Account']")private WebElement MyAcc;
	WebDriver driver;

P4_Home(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
public void MoveToMyAcc() 
{
	Actions act=new Actions(driver);
	act.moveToElement(MyAcc).perform();
}
}