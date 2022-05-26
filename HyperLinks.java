package selenium.week2;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Link.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click();
		 driver.findElement(By.xpath("//h5[contains(text(),'HyperLink')]")).click();
		// driver.navigate().back();
		 
		 //Find where am supposed to go without clicking me?
		 WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Find')]"));
		String ele = element.getAttribute("href");
		System.out.println("The page is taking to " + ele);
		element.click();
		
		//Find Color
		WebElement color = driver.findElement(By.xpath("//button[@id='color']"));
	String colors=	color.getCssValue("background-color");
	System.out.println("The color is "+ colors); 
		
	WebElement element2 = driver.findElement(By.xpath("//button[contains(text(),'Get Position')]"));

	//Find Position
	System.out.println("The position "+ element2.getLocation() );
	
	//Find Size
	WebElement element3 = driver.findElement(By.xpath("	//button[@id='size']"));
	//element3.getSize();
	System.out.println("The size is "+ element3.getSize());

	//Click button
	driver.findElement(By.xpath("//button[@id='home']")).click();
	
	 driver.findElement(By.xpath("//h5[contains(text(),'HyperLink')]")).click();
	 
	 //Verify am i broken
	 driver.findElement(By.xpath("//a[contains(text(),'Verify')]")).click();
	 Thread.sleep(3000);
	 driver.navigate().back();
	
	 // Interact with link name
	 driver.findElement(By.xpath("//a[contains(text(),'Go')] ")).click();
	 Thread.sleep(1000);
	 driver.navigate().back();
	
	 //How many links in a page
	 driver.findElement(By.xpath("//a[contains(text(),'How many')] ")).click();
	java.util.List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total Links "+list.size());
	
		 

	}

}
