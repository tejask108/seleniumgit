package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
	private Properties prop;
	
	public PropertyHelper(String fileName) 
	{
        try {
			File f = new File(System.getProperty("user.dir")+"\\"+fileName);
			
			FileInputStream fis = new FileInputStream(f);
			
			 prop = new Properties();
			
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		
	}
	
	public String getValueofKey(String key)
	{
		
		String data = prop.getProperty(key);
		
		return data;
		
	}
	
	public static void main(String[] args) {
		PropertyHelper oo = new PropertyHelper("KTCTC.properties");
		String dd = oo.getValueofKey("baseUrl");
		System.out.println(dd);
	}
	

}
