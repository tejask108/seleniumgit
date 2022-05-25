package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File(System.getProperty("user.dir") + "\\KTCTC.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Oct");

		// XSSFRow row = sh.getRow(2);

		// XSSFCell cel = row.getCell(0);
		int numberofRows = sh.getLastRowNum();

		HashMap<String, String> data = new HashMap<>();
		for (int i = 1; i <= numberofRows; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel0 = row.getCell(0);
			XSSFCell cel1 = row.getCell(1);
			String str0 = getCellValueAsStringFromProvidedCell(cel0);
			String str1 = getCellValueAsStringFromProvidedCell(cel1);
			data.put(str0, str1);

		}

		System.out.println(data);
		

	}

	public static String getCellValueAsStringFromProvidedCell(XSSFCell cel) {
		String data = null;
		switch (cel.getCellType()) {
		case STRING:
			data = cel.getStringCellValue();
			break;
		case NUMERIC:
			data = String.valueOf(cel.getNumericCellValue());
			break;
		case BOOLEAN:
			data = String.valueOf(cel.getBooleanCellValue());
			break;
		case FORMULA:
			data = String.valueOf(cel.getCellFormula());
			break;
		case BLANK:
			System.out.println("Cell does not have any value");
			break;

		default:
			break;
		}

		return data;
	}

}
