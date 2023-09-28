package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWord_3_Enabled {

	@Test
	
	public void TC1()
	{
		Reporter.log("TC1 pass", true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("TC2 pass", true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("TC3 pass", true);
	}
	
	
	
	
}
