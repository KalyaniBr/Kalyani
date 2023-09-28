package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_1_InvocationCount
{

	@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("TC1 is pass", true);
	}

	
	
	
	
	
	
	
	
}
