package readDaTa;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		//to provide the path
		FileInputStream fis = new FileInputStream("./src/main/resources/Test data.xlsx");
		
		//Make the file ready t0 read
		Workbook wd = WorkbookFactory.create(fis);
		
		//read methods to read the data
		Sheet sheet = wd.getSheet("IPL");
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		String team = cell.getStringCellValue();
		System.out.println(team);
	}
      
}
