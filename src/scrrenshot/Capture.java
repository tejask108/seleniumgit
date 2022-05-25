package scrrenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
Capture obj=new Capture();
obj.getscreenshot(driver, "ab");

		
	}
	public String getscreenshot(WebDriver driver, String filename) {
	File screeshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destfile=null;
	destfile =new File(System.getProperty("user.dir")+"\\screenshots\\"+filename+".png");
	try {
		Files.copy(screeshot.toPath(),destfile.toPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return destfile.toString();

}
}
