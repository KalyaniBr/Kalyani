package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class T1_LoginTest {
	WebDriver driver;
	C1Login login;
	C2_MobileNo Mobno;
	C3_Pwd pwd;
	C4_HomePage home;
	C5_MyACC Acc;
	C6_Myprofile profile;
	Sheet sh;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
		 sh=WorkbookFactory.create(file).getSheet("Sheet4");
		 
		 ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
			 driver=new ChromeDriver(opt);
			driver.get("https://www.policybazaar.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			
			login=new C1Login(driver);
			Mobno=new C2_MobileNo(driver);
		     pwd=new C3_Pwd(driver);
		     home=new C4_HomePage(driver);
		     Acc=new C5_MyACC(driver);
		     profile=new C6_Myprofile(driver);
	}
	
	@BeforeMethod
	public void LoginToAPP() throws InterruptedException
	{
		login.clickonSignin();
		Thread.sleep(2000);
		Mobno.EnterMobno(sh.getRow(1).getCell(0).getStringCellValue());
		Mobno.clickonsignin();
		Thread.sleep(2000);
		pwd.EnterPWD(sh.getRow(1).getCell(1).getStringCellValue());
		pwd.clicSignInButton();
		Thread.sleep(2000);
		
		
	}
	
	@Test
	public void VerifyName() throws InterruptedException
	{
		home.moveToMyAcc();
		Acc.clickonMyProfile();
		profile.SwitchToWindow();
		Thread.sleep(2000);
        String actname = profile.MyprofileName();
		String expname=sh.getRow(1).getCell(2).getStringCellValue();
		Assert.assertEquals(actname, expname,"Failed:both results are diff");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void Logout()
	{
		
	}
	
	@AfterClass()
	public void closebowser()
	{
		driver.quit();
	}
	
	
	
	
}









