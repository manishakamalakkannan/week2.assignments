package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class InteractImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Image.html");
//driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
//driver.navigate().back();

driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/following::img")).click();

//WebElement elements = driver.findElement(By.xpath("//label[contains(text(),'Click me using')]/following-sibling::img"));
WebDriver webdriver = null;
Actions action = new Actions(webdriver);
WebElement we = webdriver.findElement(By.xpath("//label[contains(text(),'Click me using')]/following-sibling::img"));
action.moveToElement(we).build().perform();

	}

}
