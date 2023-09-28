package POM_DDF_TestNG_Utilitylass_BaseClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {

	public static String getTestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return  value;
	}
	
	
	
	
}
