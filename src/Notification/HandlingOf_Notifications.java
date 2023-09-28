package Notification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingOf_Notifications {
public static void main(String[] args) {
	
	ChromeOptions opt=new ChromeOptions();
	
	opt.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(opt);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	
	
}
}
