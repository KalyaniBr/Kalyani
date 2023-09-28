package CustmisedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectNovOptions_UsingEndkey {
public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a [text()='Create new account']")).click();
	Thread.sleep(3000);
	
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions act=new Actions(driver);
	
	act.click(month).perform();
	
	Thread.sleep(3000);
	act.sendKeys(Keys.END).perform();
	
	for(int i=1;i<=1;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		
	}
	
	act.sendKeys(Keys.ENTER).perform();
}
}
