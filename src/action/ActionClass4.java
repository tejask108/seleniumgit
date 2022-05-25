package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demoqa.com/text-box");
			
			Actions act = new Actions(driver);
			
			act.click(driver.findElement(By.id("userName")))
			.keyDown(Keys.SHIFT).sendKeys("Hello welcome to ktctc")
			.keyUp(Keys.SHIFT).build().perform();
				
			
			//driver.close();

	}

}
