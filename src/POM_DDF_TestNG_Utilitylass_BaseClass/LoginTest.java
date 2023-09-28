package POM_DDF_TestNG_Utilitylass_BaseClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

	
	P1_Login login;
	P2_Mobno mob;
	P3_Password pass;
	P4_Home home;
	P5_MyACC acc;
	P6_MyProfile profile;
	
	

	@BeforeClass
	public void OpenBrowser()
	{
		initializeBrowser();
		
		login=new P1_Login(driver);
		mob=new P2_Mobno(driver);
		pass=new P3_Password(driver);
		home=new P4_Home(driver);
		acc=new P5_MyACC(driver);
		profile=new P6_MyProfile(driver);
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.ClicOnSignInBtn();                              
		//Thread.sleep(3000);
		mob.EnterMOBno(UtilityClass.getTestData(1,0));
		mob.clickonSinginwithPWD();
		Thread.sleep(3000);

		pass.EnterPWD(UtilityClass.getTestData(1, 1));
		pass.PWDClickOnSignIn();
		Thread.sleep(3000);

	}
	
	@Test
	public void verifyname() throws EncryptedDocumentException, IOException
	{
		home.MoveToMyAcc();
		acc.ClickOnMyProfile();
		profile.SwitchtoWindow();
		String actname=profile.verifyname();
		String expname=UtilityClass.getTestData(1, 2);
		Assert.assertEquals(actname, expname,"Failed: both results are diff");
		
	}
	
	
	@AfterMethod
	public void name()
	{
		
	}
	
	@AfterClass
	public void closebrowser()
	
	{
		driver.quit();
	
	}
	
	
}

