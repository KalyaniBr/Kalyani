package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	//System.setProperty("WebDriver.driver.chrome", "C:\\Users\\jayas\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	driver.get("https://www.facebook.com/");
	
	//driver.close();
	//driver.quit();
	String url=driver.getCurrentUrl();
	System.out.println(url);
   // String title=driver.getTitle();
    
   // System.out.println(title);
  
   // System.out.println(driver.getTitle());
    
   // System.out.println(driver.getCurrentUrl());
    
  
    
  //  driver.manage().window().maximize();
    
    
  //  driver.manage().window().minimize();
    
    driver.navigate().to("https://www.google.co.in/");
    
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    

}
}
