package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C4_PBHomePage 
{
@FindBy(xpath="//div[text()='My Account']")WebElement MyAcc;
WebDriver driver;

C4_PBHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void moveToPB_MyAcc()
{
	Actions act=new Actions (driver);
	act.moveToElement(MyAcc).perform();
}







}
