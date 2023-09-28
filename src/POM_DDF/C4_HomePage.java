package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C4_HomePage {

	@FindBy(xpath="//div[text()='My Account']")WebElement MyACC;
	WebDriver driver;
	
	C4_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this. driver=driver;
	}
	
	public void moveToMyAcc() 
	{
		Actions act=new Actions(driver);
		act.moveToElement(MyACC).perform();
	}
	
	
	
}
