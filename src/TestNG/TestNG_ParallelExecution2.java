package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_ParallelExecution2

{
	@Test
	public void TC3() throws InterruptedException
	{
		
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.instagram.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	}
@Test
	
	public void TC4() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}	
}