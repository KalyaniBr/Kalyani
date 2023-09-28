package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataFromspecificIndex {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();

	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/S6.html");
	
	//Thread.sleep(3000);
	
	//String value=driver.findElement(By.xpath("//table[@border='1']//tr[1]/th[2]")).getText();
	
	//System.out.println(value);
	
	Thread.sleep(3000);
	
String value1=driver.findElement(By.xpath("//table[@border='1']//tr[2]/td[2]")).getText();
	
	System.out.println(value1);
	
}
}
