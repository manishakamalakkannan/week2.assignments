package selenium.week2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/checkbox.html");
		 driver.manage().window().maximize();
		 
		 //Select languages
		driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input[@type='checkbox']//following-sibling::input[@type='checkbox']")).click();
		//select checkbox
		boolean b = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		System.out.println("The confirmed value is " + b);
		//deselect checkbox
		boolean C = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input")).isSelected();
		
		if(C== false)
		{
			System.out.println("The checkbox is deselected");
		}
		
		//select all checkbox
				java.util.List<WebElement> elements = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
				 for (WebElement checkboxes : elements) {
				           checkboxes.click();		
		         
	}

}
}
