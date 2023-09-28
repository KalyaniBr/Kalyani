package AutoSuggessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	
	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("redmi");
	Thread.sleep(3000);
	List<WebElement> List=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	String ele="redmi note 12";
	for(WebElement one:List)
	
	{
		String name=one.getText();
		
		if(name.equals(ele))
		{
			one.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
}
}
