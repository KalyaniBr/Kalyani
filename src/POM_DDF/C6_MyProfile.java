package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C6_MyProfile {
	@FindBy(xpath="//input[@name='personName']")WebElement Myname;
	WebDriver driver;
	
	C6_MyProfile(WebDriver driver)
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
	
	public void VerfyName(String Expname)
	{
		String actname= Myname.getAttribute("value");
		
		if(actname.equals(actname))
		{
			System.out.println("Tc Pass");
		}
		else
		{
			System.out.println("Tc Fail");

		}
	}
}
