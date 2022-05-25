package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");			    	
	    WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://demoqa.com/select-menu");
			WebElement dd = driver.findElement(By.xpath("//*[@id='withOptGroup']//input"));
			
			dd.sendKeys("group 2, option 1");
			dd.sendKeys(Keys.ENTER);
			
           WebElement dd1 = driver.findElement(By.xpath("//*[@id='selectOne']//input"));
			
			dd1.sendKeys("Mrs.");
			dd1.sendKeys(Keys.ENTER);
			
			

	}

}
