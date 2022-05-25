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

public class AlertsClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		
		
		
		Alert alt = driver.switchTo().alert();		
		
		String msg = alt.getText();
		System.out.println(msg);
		
		
		alt.sendKeys("KTCTC");
		
		
		/*
		 * try { Robot rb = new Robot();
		 * 
		 * rb.keyPress(KeyEvent.VK_TAB); rb.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * 
		 * }
		 */
				
		
		alt.accept();
		
		driver.close();

	}

}
