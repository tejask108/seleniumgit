package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FifthClassLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver.findElement(By.partialLinkText("Voting Information")).click();				
				driver.findElement(By.linkText("Messenger")).click();
				
				driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));

	}

}
