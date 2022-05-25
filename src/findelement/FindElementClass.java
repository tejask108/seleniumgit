package findelement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailText = driver.findElement(By.xpath("//form//div//input"));
		emailText.sendKeys("KTCTC");
		
		List<WebElement> inputTexts = driver.findElements(By.xpath("//form//div//input"));
		
		for (int i=0;i<inputTexts.size();i++)
		{
			/*
			 * WebElement temp = inputTexts.get(i); temp.sendKeys("ABCD"+ i);
			 */
			
			inputTexts.get(i).sendKeys("ABCD "+i);
		}
		
		for (WebElement each: inputTexts)
		{
			each.sendKeys("ABCD");
		}
		
		Iterator< WebElement> itr = inputTexts.iterator();
		
		while(itr.hasNext())
		{
			itr.next().sendKeys("PQRS");
		}
		
		//driver.close();
		

	}

}
