package tables;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");			    	
	    WebDriver driver = new ChromeDriver();
			// Below line is writter to maximize lounched browser
			driver.manage().window().maximize();// this will not work on linux server
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			
			float cntPrice = getCurrentPriceOfMentionedOrganization(driver,"Bank");
			System.out.println(cntPrice);
			
			HashMap<String, String> readData = getAllInformationOfOrganization(driver, "Finance");
			
			System.out.println(readData.get("CompanyName"));
			System.out.println(readData.get("PerChange"));
			
			for (Entry<String, String> each: readData.entrySet())
			{
				System.out.println(each.getKey());
				System.out.println(each.getValue());
			}
					
	}
	
	public static float getCurrentPriceOfMentionedOrganization(WebDriver dri ,String cName)
	{
		
		String cntPrice = dri.findElement(By.xpath("//tbody//td/a[contains(text(),'"+cName+"')]/parent::td/following-sibling::td[3]")).getText();
		
		float fl = Float.parseFloat(cntPrice);
		
		return fl;
		
	}
	
	public static HashMap<String, String> getAllInformationOfOrganization(WebDriver dri, String cName)
	{
		HashMap<String, String> data = new HashMap<>();
		
		data.put("CompanyName", dri.findElement(By.xpath("//tbody//td/a[contains(text(),'"+cName+"')]")).getText());
		data.put("Group", dri.findElement(By.xpath("//tbody//td/a[contains(text(),'"+cName+"')]/parent::td/following-sibling::td[1]")).getText());
		data.put("PrevClose", dri.findElement(By.xpath("//tbody//td/a[contains(text(),'"+cName+"')]/parent::td/following-sibling::td[2]")).getText());
		data.put("CntPrice", dri.findElement(By.xpath("//tbody//td/a[contains(text(),'"+cName+"')]/parent::td/following-sibling::td[3]")).getText());
		data.put("PerChange", dri.findElement(By.xpath("//tbody//td/a[contains(text(),'"+cName+"')]/parent::td/following-sibling::td[4]/font")).getText());
		
		return data;
		
	}

}
