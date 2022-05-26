package selenium.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get(" https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manisha");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mithun");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test12345");
		 
		 //drop down
		 WebElement drop1=	 driver.findElement(By.xpath("//select[@id='day']"));
			Select dropdown1=new Select(drop1);
			dropdown1.selectByValue("6");
			 WebElement drop2=	 driver.findElement(By.xpath("//select[@id='month']"));
				Select dropdown2=new Select(drop2);
				dropdown2.selectByVisibleText("Aug");
				 WebElement drop3=	 driver.findElement(By.xpath("//select[@id='year']"));
					Select dropdown3=new Select(drop3);
					dropdown3.selectByVisibleText("1990");
					driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();		 
		 
	}

}
