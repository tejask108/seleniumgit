package scrrenshot;

import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotClass {
	
	public static File report=new File(System.getProperty("user.dir"+"\\screenshots"));
	
	
	File destfile=null;


	
	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
      try {
    	 destfile =new File(report+".png");
    	 Files.copy(srcfile.toPath(),destfile.toPath());
      }
	
	catch(Exception e) {
		
		

}
}
}
