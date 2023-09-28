package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_DisableTCExedutionFromTestSuit1 {

	
	@Test
	
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test
	
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
@Test
	
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	
	//TC2 is diabled by using includes TC1 and TC2 in Test Suit
}
