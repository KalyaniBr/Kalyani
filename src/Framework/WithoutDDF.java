package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutDDF {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	//useranme
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
	//password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	
	//Click on login
	
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	//verify logo
	boolean logo=driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	
	if(logo==true)
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is absent");
	}
	
	//click on menu
	
	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	
	//click on logout
	
	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	
}
}
