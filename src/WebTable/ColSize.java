package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColSize {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/S6.html");
	
	List<WebElement>allele=driver.findElements(By.xpath("//table[@border='1']//tr[1]/th"));
	
	System.out.println(allele.size());
	
}
}
