package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Oct");
		
		//XSSFRow row = sh.getRow(2);
		
		//XSSFCell cel = row.getCell(0);
		int numberofRows = sh.getLastRowNum();
		System.out.println(numberofRows);
		int noOfRows = sh.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		
		// Below code is to print first column values
		
		for (int i=0;i<=numberofRows;i++)
		{
			XSSFRow row = sh.getRow(i);
			
			XSSFCell cel = row.getCell(0);
		
		System.out.println(cel.getStringCellValue());
	
		}
		
		for (int i=0;i<=numberofRows;i++)
		{
			XSSFRow row = sh.getRow(i);
			
			XSSFCell cel = row.getCell(0);
		
		System.out.println(String.valueOf(cel));
	
		}
		
		for (int i=0;i<=numberofRows;i++)
		{
			
		
		System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
	
		}
		
		System.out.println("===============================================");
		
		for (int i=0;i<=numberofRows;i++)
		{
			XSSFRow row = sh.getRow(i);
			
			XSSFCell cel = row.getCell(1);
		
		System.out.println(cel.getStringCellValue());
	
		}
	
	
		
		
		

	}

}
