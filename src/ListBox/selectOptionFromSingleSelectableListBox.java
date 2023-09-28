package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOptionFromSingleSelectableListBox {
public static void main(String[] args) throws InterruptedException {
	
   WebDriver driver=new ChromeDriver();
	
	driver .get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);

	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select select=new Select(month);
	
	//select.selectByIndex(4);
	select.selectByValue("6");
	//select.selectByVisibleText("Jan");
}
}
