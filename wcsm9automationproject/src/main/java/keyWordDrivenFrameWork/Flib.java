package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readDataFromExcel(String path,String sheetname,int rowcount,int cellcount ) throws EncryptedDocumentException, IOException  {
		
	//storing all the generic reusable methods And all the method are non static
		 
		//to provide the path
		FileInputStream fis = new FileInputStream(path);
		
		//Make the file ready t0 read
		Workbook wd = WorkbookFactory.create(fis);
		
		//read methods to read the data
		Sheet sheet = wd.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		
		Cell cell = row.getCell(cellcount);
		String data=null;
		if (cell.getStringCellValue().equals(cell.getCellType().STRING))
		{
		    data=cell.getStringCellValue();
		}
		else if (cell.getCellType()==cell.getCellType().NUMERIC)
		{
			data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
		}
		return data;
	}
	
	public void writeDataToExcel(String path,String sheetname,int rowcount,int cellcount ,String data ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.createRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
	}
    
	public int rowcount(String path,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc=sheet.getLastRowNum();
		return rc;
	}
	
	public String readDataFromProperty(String path,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(path);
		
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		
		return data;
	}

}
