package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectEdOptionfromultiSelectable {
public static void main(String[] args) {



	 WebDriver driver=new ChromeDriver();
		
		driver .get("file:///C:/Users/jayas/Desktop/Notes/created%20html/dropdown.html");
		
		WebElement mlist=driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(mlist);
		
		s.selectByIndex(0);
		s.selectByVisibleText("aus");
		
		
		List<WebElement>alloptions=s.getAllSelectedOptions();
	 for(WebElement x:alloptions)

	 {
		 System.out.println(x.getText());
	 }
}
}
