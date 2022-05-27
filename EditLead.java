package selenium.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Enter the username
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		

			//Enter the password
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		// Click Login
		 
		 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		 
	//	 Click crm/sfa link
		 
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 
	//	 Click Leads link crmsfa
		 
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")) .click();
		
	//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//Keys
		driver.findElement(By.xpath("//input[@name='id']/following::input[@name='firstName']")).sendKeys("Manisha");
		
		//Submit
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1000);
		
		//Click operation
		WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		element.click();
		
		//get title
		System.out.println("The title is "+ driver.getTitle());
		
		//Click Edit
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		//Change company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Testing");
		
		//update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		WebElement view = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String v= view.getText();
		if(v.startsWith("Testing"))
		{
			System.out.println("The company name is updated");
			
		}
		
		else
		{
			System.out.println("The company name is not updated");
		}
		
		driver.close();
		
	}

}
