package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		By em = By.id("email");
		
		driver.findElement(em).sendKeys(" ");
		
		driver.findElement(By.id("pass")).sendKeys("sdfwfewfwe");
		
	
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
			
		//wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='email_container']//a[contains(text(),'Find your account and log in.')]"))));
		
		//wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("pass"))));
		
		//wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("pass"))));
		
		wt.until(ExpectedConditions.alertIsPresent());
		
		//wt.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("sdfwfwef"))));
		
		//wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(3));
		
		String data = driver.findElement(By.xpath("//*[@id='email_container']//a[contains(text(),'Find your account and log in.')]")).getText();
		
		driver.findElement(By.id("email")).sendKeys("sdfewfewfew");
  System.out.println(data);
	}

}
