package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass5 
{
   @Test
   private void TC1()
   {
	   boolean result=false;  //in Hard asert if One assertfails it donot verify next assert
	   
	   Assert.assertTrue(result,"Failed:result is fales");
	   
	   
	   String actresult="Hello";
	   String Expresult="Hello";
	   
	   Assert.assertEquals(actresult, Expresult,"Failed :results are diff");
   }
}
