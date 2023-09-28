package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass1_assertEquals {
@Test
public void TC1()
{
	String actresult ="Hi";
	String expresult="hello";
	
	Assert.assertEquals(actresult, expresult,"Filed:Both results are different");
}
	
}
