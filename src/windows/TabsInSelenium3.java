package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsInSelenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");	
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("windowButton")).click();	
		
		
		Set<String> hand = driver.getWindowHandles();
		
		for (String each:hand)
		{
			if(!each.equals(parentWindow))
			{
				driver.switchTo().window(each);
				
			}
			
		}	
		
		String txt = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(txt);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.id("windowButton")).click();
		
		
		
		driver.quit();
		
		
		
	

	}

}
