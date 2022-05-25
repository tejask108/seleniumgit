package getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement fbText = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect and')]"));
		
		String fontSize = fbText.getCssValue("font-size");
 		System.out.println(fontSize);
		String fontFamily = fbText.getCssValue("font-family");
		System.out.println(fontFamily);
		String textColor = fbText.getCssValue("font-color");
		System.out.println(textColor);
		
		

	}

}
