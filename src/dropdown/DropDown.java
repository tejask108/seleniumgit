package dropdown;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement dd = driver.findElement(By.name("country"));		
		Select sel = new Select(dd);
		
		sel.selectByIndex(2);
		
		sel.selectByValue("BRAZIL");
		
		sel.selectByVisibleText("COCOS (KEELING) ISLANDS");
		
		sel.deselectByVisibleText("COCOS (KEELING) ISLANDS");
		
		
		

	}
	
	
	}


