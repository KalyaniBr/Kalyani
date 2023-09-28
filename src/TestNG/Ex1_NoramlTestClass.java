package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_NoramlTestClass 
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.close();
	
}
}
