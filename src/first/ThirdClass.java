package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
	
		// If we want to perform multiple operations on same element then use below approch
		WebElement emailBox = driver.findElement(By.id("email"));
		
		emailBox.sendKeys("KTCTC");
		
		emailBox.sendKeys(" welcome");
		
		// If we want to perform single operations on same element then use below approch
		driver.findElement(By.id("email")).sendKeys("KKKK");
		driver.findElement(By.id("email")).sendKeys(" sdgfewgegr");
		
		
		By em1 = By.name("email");
		
		WebElement emailBoxDuplicate = driver.findElement(em1);
		
		emailBoxDuplicate.sendKeys(" Welcome");
		
		By ps = By.id("pass");
		
		WebElement password = driver.findElement(ps);
		
		password.sendKeys("KTCTC123456");
		
		driver.close();
		

	}

}
