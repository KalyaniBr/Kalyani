package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex2_TestNgClass {

	@Test
	
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
}
