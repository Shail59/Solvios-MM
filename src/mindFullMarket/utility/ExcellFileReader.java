package mindFullMarket.utility;

import java.io.File;
import java.io.FileInputStream;

 
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  



public class ExcellFileReader {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	File file;
	String filePath;
	FileInputStream fi;
	
	public ExcellFileReader(String filePath) {
		
		this.filePath = filePath;
		
		try {
			
			file = new File(filePath);
			fi   = new FileInputStream(file);
			wb   = new XSSFWorkbook(fi);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public int totalRow (String sheetName) {
		
		sheet = wb.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum() + 1 ;
		return rows;
		
	}
	
	
	public int totalColumn (String sheetName) {
		
		sheet = wb.getSheet(sheetName);
		int cols =  sheet.getRow (0).getLastCellNum();
		
		// cols = cols - 1; // Edited by shail 
		// cols = cols + 1; 
		
		return cols;
		
	}
	
	
	
	public String getData(String sheetName, int rowNum, int columnNum) {
		
		String data;

		try {
			
			data = wb.getSheet(sheetName).getRow(rowNum).getCell(columnNum).getRichStringCellValue();
			
		}catch (Exception e) {
			
			data = wb.getSheet(sheetName).getRow(rowNum).getCell(columnNum).getRichStringCellValue();
			data = String.valueOf(d);
			
		}
		
		return data;
		
	}

}	
	

