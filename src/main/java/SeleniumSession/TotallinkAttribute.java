package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotallinkAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		List <WebElement> al = driver.findElements(By.tagName("a"));
		
		for(WebElement e : al)
		{
			//System.out.println("Link is "+e.getAttribute("alt")+" and Attribute is "+e.getAttribute("src"));
			System.out.println("Link is "+e.getText()+" and Attribute is "+e.getAttribute("href"));
		}		

	}

}
