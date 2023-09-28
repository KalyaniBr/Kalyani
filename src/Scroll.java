import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	driver.manage()
	Thread.sleep(3000);
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	
	Thread.sleep(3000);
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	
}
}
