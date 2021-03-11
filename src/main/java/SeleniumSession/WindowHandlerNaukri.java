package SeleniumSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerNaukri {
	
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> windowhandle = driver.getWindowHandles();
		
		//Iterator<String> itr = windowhandle.iterator();
		
		List<String> ls = new ArrayList<String>(windowhandle);
		
		for(int i=1;i<ls.size();i++)
		{
			String window = ls.get(i);
			
			driver.switchTo().window(window);
			
			System.out.println("Title is "+driver.getTitle());
			
			driver.close();
		}
		
		driver.switchTo().window(ls.get(0));
		
		System.out.println("Title is "+driver.getTitle());					// If no window is avilable 
	}

}
