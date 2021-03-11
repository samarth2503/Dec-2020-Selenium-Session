package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementUtil {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println("Totla number of Links are : "+linklist.size());
		
		for(int i=0;i<linklist.size();i++)
		{
			String LinkText = linklist.get(i).getText();
			
			if(!LinkText.isEmpty())
			{
				System.out.println("LinText "+"i "+ "is = "+LinkText);
			}
			
		}

	}

}
