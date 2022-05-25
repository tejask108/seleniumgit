package getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement emailTextBox = driver.findElement(By.id("email"));
			
			String atrTxt = emailTextBox.getAttribute("placeholder");
			System.out.println(atrTxt);
			
			emailTextBox.sendKeys("KTCTC");
			
			String txt = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect and')]")).getText();
			System.out.println(txt);
			
			String ttt = emailTextBox.getAttribute("value");
			System.out.println(ttt);
			String txt1 = emailTextBox.getText();
			System.out.println(txt1);
			//driver.close();
			

	}

}
