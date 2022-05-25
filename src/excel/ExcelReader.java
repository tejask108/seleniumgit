package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Oct");
		
		XSSFRow row = sh.getRow(2);
		
		XSSFCell cel = row.getCell(0);
		
		String data = cel.getStringCellValue();
		System.out.println(data);
		
	System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
	
	System.out.println(wb.getSheet("Oct").getRow(1).getCell(1).getStringCellValue());
	
	//System.out.println(new XSSFWorkbook(fis).getSheet("Oct").getRow(1).getCell(1).getStringCellValue());	
	//System.out.println(new XSSFWorkbook(new FileInputStream(f)).getSheet("Oct").getRow(1).getCell(1).getStringCellValue());
	System.out.println(new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"\\KTCTC.xlsx"))).getSheet("Oct").getRow(1).getCell(1).getStringCellValue());
	
	
		
		
		

	}

}
