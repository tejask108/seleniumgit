package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedSelecteEnabled2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		
		WebElement noRadio = driver.findElement(By.id("noRadio"));
		
		System.out.println(noRadio.isEnabled());
		System.out.println(noRadio.isSelected());
		System.out.println(noRadio.isDisplayed());
		driver.close();
		
		

	}

}
