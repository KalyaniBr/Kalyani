package AutoSuggessions;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.findElement( By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("sam");
	
List<WebElement>allele = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	
	String exp="samsung a54 5g";
	
	for(WebElement ele:allele)
	{
		String s1=ele.getText();
		if(s1.equals(exp))
		{
			s1
		}
	}
}
}
