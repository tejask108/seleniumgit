package getmethods;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(3000);
		
		List<WebElement> liElement = driver.findElements(By.xpath("//li//span"));
		
	for (WebElement each: liElement)
	{
		String ss = each.getText().replace("\n", "").replace("  ", " ");
		
		if (ss!=null && ss.contains("testing classes in pune"))
		{
				each.click();			
			
		}
	}	

	}

}
