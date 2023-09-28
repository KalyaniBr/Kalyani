package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	
	driver .get("https://www.facebook.com/");
	
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abs");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");

	
	Thread.sleep(3000);
	
  driver.findElement(By.xpath("//input[@id='email']")).clear();
	driver.findElement(By.xpath("//input[@type='password']")).clear();
	
	

	
	
	
	
	
	
}
}
