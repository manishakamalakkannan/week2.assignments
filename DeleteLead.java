package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
			 driver.get("http://leaftaps.com/opentaps/control/login");
		
			 driver.manage().window().maximize();
			 WebElement elemFirst = driver.findElement(By.id("username"));
			 elemFirst.sendKeys("DemoSalesManager");
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			 driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			
		
		//	11	Capture lead ID of First Resulting lead
			WebElement element = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));
			element.click();
		
			
	
		//	13	Click Delete
		//	14	Click Find leads
		//	15	Enter captured lead ID
		//	16	Click find leads button
		//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		//	18	Close the browser (Do not log out) 

	}

}
