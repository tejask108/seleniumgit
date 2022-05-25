package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64 (2)\\msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		
		ChromeDriver chDriver1 = new ChromeDriver();
		
		chDriver1.get("https://www.facebook.com/");
		
		ChromeDriver chDriver2 = new ChromeDriver();
		
		chDriver2.get("https://www.messenger.com/");
		
		System.out.println("Welcome to KTCTC");
		
		
		EdgeDriver edDriver = new EdgeDriver();
		edDriver.get("https://www.facebook.com/");
		System.out.println("gecko");
		
	}

}
