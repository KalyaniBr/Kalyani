package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) {
	

	
	WebDriver driver=new ChromeDriver();
	
	driver .get("https://www.facebook.com/");
	
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abs");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");

	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	
	
	
	
}
}
