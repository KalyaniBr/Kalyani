package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass2_assertNotequals {

	@Test
	public void Tc1()
	{
		String Act="Hii";
		String Exp="Hii";
		
		Assert.assertNotEquals(Act, Exp,"Faild:result is not equal");
	}
	
	
	
	
	
}
