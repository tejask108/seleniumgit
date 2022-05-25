package tables;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");			    	
	    WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			printDetailsofOrgWithMoreCntPrice(driver);
			
					
	}
	public static void printDetails(WebDriver driver)
	{
		List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
		
		for (WebElement each:rows)
		{
			String cName = each.findElement(By.xpath("td/a")).getText();
			String cntPrice = each.findElement(By.xpath("td[4]")).getText();
			System.out.println("Company Name = "+cName+" Cnt Price = "+ cntPrice);
			
		}
	}
	
	public static void printDetails1(WebDriver driver)
	{
		List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
		
		for (int i=1; i<=rows.size();i++)
		{
			String cName = driver.findElement(By.xpath("//tbody//tr["+i+"]//td/a")).getText();
			String cntPrice = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[4]")).getText();
			System.out.println("Company Name = "+cName+" Cnt Price = "+ cntPrice);
			
		}
		
		
	}
	
	public static void printDetailsofOrgWithMoreCntPrice(WebDriver driver)
	{
		List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
		
		for (int i=1; i<=rows.size();i++)
		{
			String cName = driver.findElement(By.xpath("//tbody//tr["+i+"]//td/a")).getText();
			String cntPrice = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[4]")).getText();
			float pr = Float.parseFloat(cntPrice);
			
			if (pr>200)
			{
			System.out.println("Company Name = "+cName+" Cnt Price = "+ cntPrice);
			}
			
		}
		
		
	}
	
	
}
