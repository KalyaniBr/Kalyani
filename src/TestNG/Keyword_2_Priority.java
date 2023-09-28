package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_2_Priority {

	@Test(priority=1)
	
	public void TC1()
	{
		Reporter.log("TC1 Pass", true);
	}
	
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("TC2 Pass", true);
	}
	
	@Test(priority=3)
	public void TC3()
	{
		Reporter.log("Tc3 Pass", true);
		
	}
	
}
