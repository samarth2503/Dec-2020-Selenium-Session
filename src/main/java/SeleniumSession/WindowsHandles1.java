package SeleniumSession;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandles1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> socail = driver.findElements(By.cssSelector("div[id=footer]>div[id='social-icons'] a"));
		
		for(WebElement link:socail)
		{
			link.click();
		}
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles+"  "+driver.getTitle());
		
		Iterator<String> itr = handles.iterator();
		
		String orange = itr.next();
		driver.switchTo().window(orange);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.close();
		
		String youtube = itr.next();
		driver.switchTo().window(youtube);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("search")).sendKeys("Naveen Automation labs");
		driver.close();
		
		String twitter = itr.next();
		driver.switchTo().window(twitter);
		System.out.println(driver.getTitle());
		driver.close();
		
		String facebook = itr.next();
		driver.switchTo().window(facebook);
		System.out.println(driver.getTitle());
		driver.close();
		
		String Linkdlin = itr.next();
		driver.switchTo().window(Linkdlin);
		System.out.println(driver.getTitle());
		driver.close();
		
		/*driver.switchTo().window(orange);
		System.out.println("After closing window title is "+driver.getTitle());*/
		
		//driver.switchTo().de
	}

}
