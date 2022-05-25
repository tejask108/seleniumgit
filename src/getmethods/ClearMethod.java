package getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		emailTextBox.sendKeys("KTCTC");
		driver.findElement(By.id("pass")).sendKeys("KT5456456");
		
		emailTextBox.clear();
		emailTextBox.sendKeys("Welcomersddsf");
		
		driver.findElement(By.name("login")).submit();
		
		driver.close();
			
			

	}

}
