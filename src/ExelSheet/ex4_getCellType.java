package ExelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;


public class ex4_getCellType {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

     org.apache.poi.ss.usermodel.CellType value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
	
  //   org.apache.poi.ss.usermodel.CellType sh=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
	System.out.println(value);
	
	
	
}
}
