package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	
	boolean result = driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
	System.out.println(result);
	
	
	
}
}
