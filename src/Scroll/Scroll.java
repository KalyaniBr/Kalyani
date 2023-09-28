package Scroll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//to scroll up
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	
	Thread.sleep(3000);
	//to scroll down
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	
	//to scroll right
	
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
	
	//to scroll left
	
	//((JavascriptExecutor)driver).executeScript("Window.scrollBy(-300,0)");
	
	
	
}
}
