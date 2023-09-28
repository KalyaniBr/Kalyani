package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_LoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	Sheet sh= WorkbookFactory.create(file).getSheet("Sheet4");
	
	ChromeOptions opt=new ChromeOptions();
       opt.addArguments("--disable-notifications");
	
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.policybazaar.com/");
	
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        C1Login c1=new C1Login(driver);
        c1.clickonSignin();;
        
        Thread.sleep(2000);
        
        String Mobno =sh.getRow(1).getCell(0).getStringCellValue();
        C2_MobileNo c2=new C2_MobileNo(driver);
        c2.EnterMobno(Mobno);
        c2.clickonsignin();
        
        Thread.sleep(2000);

        String Pwd=sh.getRow(1).getCell(1).getStringCellValue();
        C3_Pwd c3=new C3_Pwd(driver);
        c3.EnterPWD(Pwd);
        c3.clicSignInButton();
        
        Thread.sleep(2000);

        C4_HomePage c4=new C4_HomePage(driver);
        c4.moveToMyAcc();
        
        Thread.sleep(2000);

        C5_MyACC c5=new C5_MyACC(driver);
        c5.clickonMyProfile();
        
        Thread.sleep(2000);

        String Expname=sh.getRow(1).getCell(2).getStringCellValue();
        C6_MyProfile c6=new C6_MyProfile(driver);
        c6.SwitchToWindow();
        c6.VerfyName(Expname);
        
        Thread.sleep(2000);

        driver.quit();
}
}
