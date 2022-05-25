package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedSelecteEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		boolean flag = driver.findElement(By.id("wefwwwetfwe")).isDisplayed();
		
		WebElement radioButton = driver.findElement(By.id("vfb-7-2"));
		
		System.out.println(radioButton.isEnabled());
		System.out.println(radioButton.isSelected());
		System.out.println(radioButton.isDisplayed());
		
		radioButton.click();
		
		System.out.println(radioButton.isEnabled());
		System.out.println(radioButton.isSelected());
		System.out.println(radioButton.isDisplayed());
		
		WebElement checkBox = driver.findElement(By.id("vfb-6-1"));
		
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		System.out.println(checkBox.isDisplayed());
		
		checkBox.click();
		
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		System.out.println(checkBox.isDisplayed());

	}

}
