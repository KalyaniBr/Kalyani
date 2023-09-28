package CustmisedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Nov_Option {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a [text()='Create new account']")).click();
	Thread.sleep(3000);
	
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions act=new Actions(driver);
	
	act.click(month).perform();
	
	
	act.sendKeys(Keys.HOME).perform();
	
	for(int i=1;i<=10;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	act.sendKeys(Keys.ENTER).perform();
	
}
}
