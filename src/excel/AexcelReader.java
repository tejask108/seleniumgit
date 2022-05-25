package excel;

public class AexcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelHelper excelHelper = new ExcelHelper("KTCTC.xlsx", "Aug");
		
	System.out.println(excelHelper.getKeysListFromExcel());	
	System.out.println(excelHelper.getValuesListFromExcel());
	System.out.println(excelHelper.getKeyValuePaireFromExcel());

	}

}
