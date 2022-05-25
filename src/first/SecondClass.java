package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By em = By.id("email");
		
		WebElement emailBox = driver.findElement(em);
		
		emailBox.sendKeys("KTCTC");
		
		By em1 = By.name("email");
		
		WebElement emailBoxDuplicate = driver.findElement(em1);
		
		emailBoxDuplicate.sendKeys(" Welcome");
		
		By ps = By.id("pass");
		
		WebElement password = driver.findElement(ps);
		
		password.sendKeys("KTCTC123456");
		
		driver.close();
		

	}

}
