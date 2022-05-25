package propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyHelper oo = new PropertyHelper("ToolQA.properties");
		System.out.println(oo.getValueofKey("baseUrl"));		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");			    	
	    WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PropertyHelper prObj = new PropertyHelper("KTCTC.properties");
			
			String url = prObj.getValueofKey("baseUrl");			
			driver.get(url);			
			driver.findElement(By.name("email")).sendKeys(prObj.getValueofKey("uname"));
			driver.findElement(By.name("password")).sendKeys(prObj.getValueofKey("pass"));
			driver.findElement(By.name("login")).click();
			

	}

}
