package navigation.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertyfile.PropertyHelper;

public class NacvigationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");			    	
	    WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://demoqa.com/radio-button");
			//driver.get("https://demoqa.com/radio-button");
			
			driver.findElement(By.xpath("//*[@class='menu-list']//span[contains(text(),'Text Box')]")).click();
			
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			
			
			
			}

}
