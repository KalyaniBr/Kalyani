package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class classMouseDreagAnsDropActions {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement src=driver.findElement(By.xpath("//a[text()=' 5000']"));
	
	WebElement dest=driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
	
	Actions act=new Actions(driver);
	
	act.dragAndDrop(src, dest).perform();
	
	
}
}
