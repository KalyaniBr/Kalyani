package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//body/div[2]/form[1]/fieldset[1]/div[1]/a[1]/input[1]")).click();
	
  Set<String> Setall = driver.getWindowHandles();
	
  ArrayList<String>ar=new ArrayList<String>(Setall);
	
  driver.switchTo().window(ar.get(0));
  
  driver.findElement(By.xpath("//header[@class='header-bar']/ul[@id='primary-menu']/li[7]")).click();
 // driver.findElement(By.xpath("//header/ul[@id='primary-menu']/li[7]/a[1]/span[1]/span[1]")).click();

	
	
}
}
