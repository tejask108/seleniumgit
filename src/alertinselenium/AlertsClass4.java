package alertinselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wt  = new WebDriverWait(driver, 10);
		
		wt.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();			
		
		alt.accept();
		
		//driver.close();

	}

}
