package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		String data = "Commands";
 
		driver.findElement(By.xpath("//*[@title='Expand all']")).click();
		driver.findElement(By.xpath("//*[@id='tree-node']//span[contains(text(), 'Notes')]")).click();
		clickCheckBox(driver, data);

		
		driver.close();
		

	}
    
	public static void clickCheckBox(WebDriver driver, String option)
	{
		driver.findElement(By.xpath("//*[@id='tree-node']//span[contains(text(), '"+option+"')]")).click();
	}
	
	public void checkProvidedOption(WebDriver driver, String option)
	{
		
	}
}
