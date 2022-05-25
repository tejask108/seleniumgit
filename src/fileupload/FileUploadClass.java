 package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/upload/");	
		
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\KTCTC.properties");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		String txt = driver.findElement(By.xpath("//*[@id='res']/center")).getText();
		
		System.out.println(txt);
		
		if (txt.replace("\n", " ").equals("1 file has been successfully uploaded."))
		{
			System.out.println("File upload test case is passed");
		}
		else
		{
			System.out.println("File upload test case is failed");
		}
		
		
	}

}
