package frames;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demoqa.com/nestedframes");
					
			driver.switchTo().frame("frame1");
			
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
			
			String data = driver.findElement(By.xpath("//body//p")).getText();
			
			System.out.println(data);
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//*[@class='accordion']//span[contains(text(),'Alert')]")).click();
			
			
			
			

	}

}
