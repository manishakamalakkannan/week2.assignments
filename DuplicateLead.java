package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
//			Enter the username
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
			//Email
				driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
				
				//Enter email
				driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("manishakamalakkannan@gmail.com");
				
				//click
				driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.xpath("//div[contains(@class,'col-firstName')]/a"));
			//	String ele = element.getText();
				System.out.println(" The first name is " + element.getText());
				Thread.sleep(1000);
			element.click();
			//click duplicaate lead
			driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
			System.out.println("The title is "+ driver.getTitle());
			
			//create lead
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			
			//duplicate lead name 
			WebElement element2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
			String v= element2.getText();
			if(v.contentEquals("Manisha"))
			{
				System.out.println("the duplicated lead name is same as captured name");
			}
			else
			{
				System.out.println("the duplicated lead name is not same as captured name");
			}
			
	}

}
