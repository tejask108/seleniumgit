package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			Actions act = new Actions(driver);
			
			WebElement sourceElement = driver.findElement(By.xpath("//*[starts-with(text(),' 5000')]"));
			WebElement targetElement = driver.findElement(By.xpath("//*[@id='amt7']/li"));
			
			act.dragAndDrop(sourceElement, targetElement).build().perform();
			
			WebElement srcElement = driver.findElement(By.xpath("//*[starts-with(text(),' BANK ')]"));
			WebElement tarElement = driver.findElement(By.xpath("//*[@id='bank']/li"));
			act.clickAndHold(srcElement).moveToElement(tarElement).release().build().perform();
				
			
			//driver.close();

	}

}
