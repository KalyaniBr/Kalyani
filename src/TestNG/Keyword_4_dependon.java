package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_4_dependon {
@Test
public void login1()
{
	Reporter.log("LOGIN Pass",true);
}

@Test
public void login2()
{
	Reporter.log("Tc1 Pass",true);
}

@Test(dependsOnMethods = {"login1","login2"})
public void logout()
{
	Reporter.log("logout Pass",true);
}
}
