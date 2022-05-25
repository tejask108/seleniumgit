package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class DatePickClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");
		String date = "02/16/2023";
		selectDateOfCalender(driver, date);
		
			
 
	}
	
	public static void selectDateOfCalender(WebDriver driver,String date)
	{
		String[] ss = date.split("/");
		int month = Integer.parseInt(ss[0]) -1;
		String day = ss[1];
		
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select yearSel = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		yearSel.selectByVisibleText(ss[2]);
		
		Select monthSel = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		monthSel.selectByValue(String.valueOf(month));	
		
	   driver.findElement(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--0"+day+"']")).click();
		
	}
	public static void selectDateOfCalender1(WebDriver driver,String date)
	{	
		
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select yearSel = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		yearSel.selectByVisibleText(date.split("/")[2]);
		
		Select monthSel = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		monthSel.selectByValue(String.valueOf(Integer.parseInt(date.split("/")[0]) -1));	
		
	   driver.findElement(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--0"+date.split("/")[1]+"']")).click();
		
	}

}
