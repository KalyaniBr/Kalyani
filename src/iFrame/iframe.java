package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

//switch to frame
Thread.sleep(2000);
driver.switchTo().frame("iframeResult");             //String frameID
//driver.switchTo().frame("iframeResult");            //String frameName
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
//driver.switchTo().frame();      //int index

driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
}
}
