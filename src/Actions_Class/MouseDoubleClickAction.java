package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Double-Click ')]"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(button).doubleClick().perform();
	
	
	
	
}
}
