package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("Before comming back title is "+driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println("After comming back title is "+driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println("After Forward title is "+driver.getTitle());
	}

}
