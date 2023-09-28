package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass3_assertTrue {

@Test

public void Tc1()
{
	boolean actResult=false;
	
	Assert.assertTrue(actResult, "Failed:actresult is false");
	
}








}
