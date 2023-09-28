package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
	
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	
	WebDriver driver =new ChromeDriver(opt);
	
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.manage().window().maximize();
	
	//click on sign in
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();

	//enter username
	   String mobno= sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mobno);
	
	//click on pwd button
	
	driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	
	//Enter pwd
	
	String pwd=sh.getRow(1).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);

	//click on signin
	
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	Thread.sleep(2000);
	//move to my account
	WebElement myacc=driver.findElement(By.xpath("//div[text()='My Account']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(myacc).perform();
	
	
	Thread.sleep(2000);
	//click on profile
	
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();

	//Thread.sleep(2000);
	//switch to frame
	
	 // Set<String> allID=driver.getWindowHandles();
	
	  //ArrayList<String> array=new ArrayList(allID);
	  // driver.switchTo().window(array.get(0));
	//switch to child window
			Set<String> allIds = driver.getWindowHandles();
			ArrayList<String> al=new ArrayList(allIds);
			driver.switchTo().window(al.get(1));
					
		String Actname=driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");

         String Expname=  sh.getRow(1).getCell(2).getStringCellValue();
		
	   if(Actname.equals(Expname))
	   {
		   System.out.println("TC Pass");
	   }
	   else
	   {
		   System.out.println("Tc Fail");
		   
	   }
	   
	   Thread.sleep(3000);
	   
	   driver.quit();
	   
	   
	   
	   
	   
}
}
