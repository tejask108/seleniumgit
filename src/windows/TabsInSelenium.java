package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		// Below line is writter to maximize lounched browser
		driver.manage().window().maximize();// this will not work on linux server
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		driver1.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		
		driver.switchTo().window(parentWindow);
		
		Set<String> hand = driver.getWindowHandles();
		
		Set<String> hh = driver1.getWindowHandles();
		
		System.out.println(parentWindow);
		
		//driver.close();
		driver1.close();
		
		driver.quit();

	}

}
