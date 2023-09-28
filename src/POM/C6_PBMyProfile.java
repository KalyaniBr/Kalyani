package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C6_PBMyProfile {

	
	@FindBy(xpath="//input[@name='personName']")WebElement Myname;
	WebDriver driver;
	
	C6_PBMyProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void PBSwitchTowindow() 
	{
		Set<String>IDs=driver.getWindowHandles();
		ArrayList<String>allID=new ArrayList(IDs);
		
	      driver.switchTo().window(allID.get(1));
			
	}
	
	public void getNameAttribute() 
	{
		String Actname=Myname.getAttribute("value");
		String Expname="Kalyani";
		if(Actname.equals(Expname))
		{
			System.out.println("Tc Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}

	}
	
	
	
	
}
