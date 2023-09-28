package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_LogoutTest {
public static void main(String[] args) throws InterruptedException {
	
ChromeOptions opt =new ChromeOptions();
	
	opt.addArguments("--disable-notifications");
	
	
	WebDriver driver=new ChromeDriver(opt);
	 driver.get("https://www.policybazaar.com");
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	C1_PBSignIn_Page s1=new C1_PBSignIn_Page(driver);
	s1.PBClickOnSignInButton();
	Thread.sleep(2000);
	
	C2_PBUsername s2=new C2_PBUsername(driver);
	s2.PBUsername();
	s2.clickonsigninwithPWDbutton();
	
	Thread.sleep(2000);
	
	C3_PBPassword s3=new C3_PBPassword(driver);
   s3.EnterPWD();
	s3.clickPBSignInButton();
	
	Thread.sleep(2000);
	
	C4_PBHomePage s4=new C4_PBHomePage(driver);
	s4.moveToPB_MyAcc();
	
	Thread.sleep(2000);

	C5_PB_MyAccPage s5=new C5_PB_MyAccPage(driver);
	s5.ClickOnSignOut();

	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	
	
	
	
}
}
