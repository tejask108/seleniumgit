package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	private XSSFSheet sh;
	public ExcelHelper(String fileName, String sheetName)
	{
		try {
			File f = new File(System.getProperty("user.dir") + "\\"+fileName);

			FileInputStream fis = new FileInputStream(f);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			 sh = wb.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

	}
	
	public ArrayList<String> getKeysListFromExcel()
	{
		ArrayList<String> keys = new ArrayList<>();
		int rowsNum = sh.getLastRowNum();
		
		for (int i=1; i<=rowsNum;i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			String eachKey = getCellValueAsStringFromProvidedCell(cel);
			keys.add(eachKey);
			
		}
		
		return keys;		
		
	}
	
	public ArrayList<String> getValuesListFromExcel()
	{
		ArrayList<String> values = new ArrayList<>();
		int rowsNum = sh.getLastRowNum();
		
		for (int i=1; i<=rowsNum;i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			String eachKey = getCellValueAsStringFromProvidedCell(cel);
			values.add(eachKey);
			
		}
		
		return values;	
	}
	
	public HashMap<String,String> getKeyValuePaireFromExcel()
	{
		HashMap<String, String> data = new HashMap<>();		
		ArrayList<String> keys = getKeysListFromExcel();
		ArrayList<String> values = getValuesListFromExcel();
		for (int i=0;i<keys.size();i++)
		{
			data.put(keys.get(i), values.get(i));		
			
		}
		return data;
		
	}
	
	
	private static String getCellValueAsStringFromProvidedCell(XSSFCell cel) {
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
