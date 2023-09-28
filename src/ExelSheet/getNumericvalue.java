package ExelSheet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericvalue {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
	
	
	Double value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	
	
	System.out.println(value);
	
	
	
}
}
