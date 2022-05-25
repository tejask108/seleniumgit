package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class DatePickClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");
		
		String date = "02/16/2023";
		WebElement datePicker = driver.findElement(By.id("datePickerMonthYearInput"));
		
		datePicker.click();
		for (int i=0;i<10;i++)
		{
			datePicker.sendKeys(Keys.BACK_SPACE);
			
		}
		
		datePicker.sendKeys(date);
		datePicker.sendKeys(Keys.ENTER);
		
			
 
	}
	
	

}
