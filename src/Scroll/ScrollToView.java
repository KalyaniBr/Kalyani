package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	WebElement help=driver.findElement(By.xpath("//a[text()='Help']"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",help);
	
}
}
