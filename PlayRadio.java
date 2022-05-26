package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/radio.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='yes']")).click();
		 driver.findElement(By.xpath("//input[@name='news']/following::input")).click();
		 driver.findElement(By.xpath("//input[@name='age']/following::input")).click();
		 
	}

}
