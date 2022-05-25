package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File(System.getProperty("user.dir") + "\\KTCTC.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Oct");

		// XSSFRow row = sh.getRow(2);

		// XSSFCell cel = row.getCell(0);
		int numberofRows = sh.getLastRowNum();

		for (int i = 0; i <= numberofRows; i++) {
			XSSFRow row = sh.getRow(i);

			XSSFCell cel = row.getCell(1);

			switch (cel.getCellType()) {
			case STRING:
				System.out.println(cel.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println(cel.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cel.getBooleanCellValue());
				break;
			case FORMULA:
				System.out.println(cel.getCellFormula());
				break;
			case BLANK:
				System.out.println("Cell does not have any value");
				break;

			default:
				break;
			}

		}

	}

}
