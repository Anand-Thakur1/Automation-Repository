package readDaTa;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatafromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		
		for(int i =1;i<9;i++)
		{
			Thread.sleep(2000);
		//to provide the path
		FileInputStream fis = new FileInputStream("./src/main/resources/Test data.xlsx");
		
		//Make the file ready t0 read
		Workbook wd = WorkbookFactory.create(fis);
		
		//read methods to read the data
		Sheet sheet = wd.getSheet("IPL");
		Row row = sheet.getRow(i);
		
		Cell cell = row.getCell(0);
		String team = cell.getStringCellValue();
		System.out.println( "team : "+team);
		}
	}
      
}
