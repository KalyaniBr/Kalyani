package TestNG;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass4_assertFalse {
 @Test
 public void Tc1()
 {
	boolean actresult=true;
	
	Assert.assertFalse(actresult ,"Failed:actresult is true");
 }
 }
