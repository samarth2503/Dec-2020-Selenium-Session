package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleelementConcept {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='list-group']/a")); 
		
		System.out.println("Size of Element is "+ele.size());
		
		for(WebElement e1:ele)
		{
			if(!(e1.getText().equals("Login")))
			{
				e1.click();
				driver.navigate().back();
				Thread.sleep(1000);
				ele = driver.findElements(By.xpath("//div[@class='list-group']/a"));
			}
		}
		
//		for(int i=0;i<=ele.size();i++)
//		{
//			ele.get(i+1).click();
//			driver.navigate().back();
//			Thread.sleep(1000);
//			ele = driver.findElements(By.xpath("//div[@class='list-group']/a"));
//			System.out.println("Element "+ele.get(i+1).getText()+" is clicked");
//		}
	}

}
