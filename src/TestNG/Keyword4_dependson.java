package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4_dependson {
	@Test
	public void login()
	{
		Reporter.log("LOGIN Pass",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Tc1 Pass",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("logout Pass",true);
	}
	
	
	
}
