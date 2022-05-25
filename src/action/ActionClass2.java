package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demoqa.com/buttons");
			
			Actions act = new Actions(driver);
			WebElement lastElement = driver.findElement(By.xpath("//*[@class='accordion']//*[contains(text(),'Book Store Application')]"));
			
			act.moveToElement(lastElement)
			.build()
			.perform();
			act.click(driver.findElement(By.xpath("//*[@class='accordion']//*[contains(text(),'Interaction')]")))
			.build().perform();
			
		
			
			//driver.close();

	}

}
