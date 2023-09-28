package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfSingleElememt {
public static void main(String[] args) throws IOException {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement text= driver.findElement(By.xpath("//h2[@class='_8eso']"));
	
	File src=text.getScreenshotAs(OutputType.FILE);
	
	
	File dest=new File("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Screenshots\\\\img1.jpg");
	
	FileHandler.copy(src, dest);
	
	
	
	
	
}
}
