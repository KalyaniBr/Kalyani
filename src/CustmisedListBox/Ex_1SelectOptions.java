package CustmisedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_1SelectOptions {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a [text()='Create new account']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	WebElement  month=driver.findElement(By.xpath("//select[@id='month']"));
	
	
	Actions act= new Actions(driver);
	
	act.click(month).perform();
	
	Thread.sleep(3000);
	
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
	Thread.sleep(3000);
	
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
	Thread.sleep(3000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
}
}
