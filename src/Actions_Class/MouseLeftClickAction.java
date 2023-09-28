package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseLeftClickAction {
public static void main(String[] args) {
	
	;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
			WebElement en=driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(en).click().perform();
	//act.click();
	
	//driver.findElement(By.xpath("//span[text()='English']")).click();
}
}
