package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	String text=driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
	
	System.out.println(text);
	
}
}
