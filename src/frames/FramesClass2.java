package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demoqa.com/frames");
			
			//driver.switchTo().frame(1);
			driver.switchTo().frame("frame1");
			//driver.switchTo().frame(driver.findElement(By.id("frame1")));			
			
			String data = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(data);
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//*[@class='accordion']//span[contains(text(),'Alert')]")).click();

	}

}
