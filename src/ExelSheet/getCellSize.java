package ExelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class getCellSize{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

	int CellSize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	
	
	System.out.println(CellSize);
	
	
	
	
	
}
}
