package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {
public static void main(String[] args) {
	
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.manage().window().maximize();
	
	WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(cart).contextClick().perform();
	
	
	
	
	
}









}
