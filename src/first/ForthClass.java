package first;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ForthClass {

	private static final TakesScreenshot driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64 (2)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("KTCTC");
		driver.findElement(By.name("pass")).sendKeys("KTCTC123");
		driver.findElement(By.name("login")).click();
		
		
		

	}
public  File report=new File(System.getProperty("user.dir"+"\\screenshots"));
	
	public void getscreensho(String filename,WebDriver driver) {
		
		if (filename=="")
			
		filename="Blank";
		
	}
	
	File destfile=null;
	Calendar cal=Calendar.getInstance();
	
	
	
	SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	
	File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	destFile = new File(report+"/"+fileName+"_"+formater.format(calendar.getTime())+".png");
	

			
			
			
			

}
