package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWritter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.properties");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		Properties prop = new Properties();
		
		prop.setProperty("uname", "PQRS");
		
		prop.store(fos, "Updated uname");
		System.out.println("Updated uname successfully");
		
		
		
		
		

	}

}
