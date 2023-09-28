package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframetomainpage {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(3000);
	
	//driver.switchTo().frame(driver.findElement(By.xpath("// button[@type='button']")));
	//By xpath
	driver.switchTo().frame("iframeResult");
	//By id
	//driver.switchTo().frame("iframeResult");
	//By Name
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();

	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	
	

	
	
	
	
	
}
}
