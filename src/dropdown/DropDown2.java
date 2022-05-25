package dropdown;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement dd = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));	
		
		Select sel = new Select(dd);
		
		//sel.selectByIndex(2);
		
		//sel.selectByValue("search-alias=fashion");
		
		sel.selectByVisibleText("Amazon Fresh");
		
		//sel.deselectByVisibleText("COCOS (KEELING) ISLANDS");
		
		
		

	}
	
	
	}


