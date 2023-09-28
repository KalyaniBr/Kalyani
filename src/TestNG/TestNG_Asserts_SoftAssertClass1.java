package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Asserts_SoftAssertClass1 
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		boolean result=true;
		soft.assertTrue(result, "failed:reult is false");
		
		
		String actresult="GM";
		String Expresult="Gn";
		soft.assertEquals(actresult, Expresult,"failed:Both are diff");
		soft.assertAll();
	}

}
