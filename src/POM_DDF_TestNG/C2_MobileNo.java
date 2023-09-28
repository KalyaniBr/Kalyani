package POM_DDF_TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C2_MobileNo {

	@FindBy(xpath="(//input[@type='number'])[2]")WebElement MobNo;
	
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")WebElement SigninWithPWD;
	
	C2_MobileNo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterMobno(String Mobno)
	{	
		MobNo.sendKeys(Mobno);
	}
	
	public void clickonsignin()
	{
		SigninWithPWD.click();
	}
}
