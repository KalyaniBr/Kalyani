package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.svg.SVGViewElement;

public class C1Login {

	
	@FindBy(xpath="//a[@class='sign-in']")WebElement signinbutton;
	
	C1Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonSignin() {
		signinbutton.click();
	}
	
	
	
	
}
