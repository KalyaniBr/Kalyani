package ExelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getBooleanCellValue {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	
	
	boolean value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	
	System.out.println(value);
	
	
	
	
	
}
}
