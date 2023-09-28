package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex3_TestNGAnnotations
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Brawser is open ",true);
	}
	
	@BeforeMethod
   public void login()
	{
	Reporter.log("Login to appication", true);
	}

	@Test
	public void TC1() 
	{
      Reporter.log("TC1 is pass", true);
      
       }
	@AfterTest
	public void Logout()
	{
		Reporter.log("Logout app", true);
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("Close browser",true);
	}
	
	
	
	
	
	
	
}
