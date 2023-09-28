package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport 
{

	@Test
	public void TC1()
	{
		Reporter.log("TC1 is Pass",true);
	}
	
	@Test
	public void TC2 ()
	{
		Reporter.log("Tc2 is pass",true);
	}
	
	
	
}
