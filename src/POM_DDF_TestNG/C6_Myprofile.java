package POM_DDF_TestNG;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C6_Myprofile {
	@FindBy(xpath="//input[@name='personName']")WebElement Myname;
	WebDriver driver;
	
	C6_Myprofile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void SwitchToWindow()
	{
		Set<String>allid=driver.getWindowHandles();
		
		ArrayList<String> ar=new ArrayList(allid);
		 driver.switchTo().window(ar.get(1));
		
	}
	
	public String MyprofileName()
	{
		String actname= Myname.getAttribute("value");
		return actname;
		
		}

}

