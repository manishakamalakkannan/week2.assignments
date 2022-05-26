package selenium.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");	
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//title
		 System.out.println("The title is " + (driver.getTitle()));
		//logout
		
		 
 driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		 
	
 
 //close
		 driver.close();
	}



}
