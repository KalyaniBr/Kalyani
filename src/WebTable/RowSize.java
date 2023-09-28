package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowSize {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
	
	driver .get("file:///C:/Users/jayas/Desktop/Notes/created%20html/S6.html");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List<WebElement>all=driver.findElements(By.xpath("//table[@border='1']//tr"));
	
	System.out.println(all.size());
	
	
	driver.close();
}
}
