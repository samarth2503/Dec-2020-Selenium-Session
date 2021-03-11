package SeleniumSession;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles2 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='social-icons']//a"));
		
		for(WebElement e : links)
		{
			e.click();
			
			Set<String> handles = driver.getWindowHandles();
			
			List<String> ls = new ArrayList<String>(handles);
			
			String parent = ls.get(0);
			String child = ls.get(1);
			
			driver.switchTo().window(child);
			
			System.out.println("Child window title is "+driver.getTitle());
			
			driver.close();
			
			driver.switchTo().window(parent);
			
			System.out.println("Parent Window title is "+driver.getTitle());
		}

	}

}
