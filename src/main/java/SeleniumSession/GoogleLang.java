package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLang {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> img = driver.findElements(By.xpath("//div[@class='ds-column-grid']//div[@class='top-site-inner']/a"));
		
		/*System.out.println("Total links are "+img.size());
		
		for(int i=0;i<img.size();i++)
		{
			if()
		}*/

	}
	
	public static WebElement getElement(By locator)
	{
		WebElement ele;
		
		try {
			ele = driver.findElement(locator);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			ele=null;
		}
		
		return ele;
	}
	
	public static List<WebElement> getElements(By locator)
	{
		List<WebElement> elements = driver.findElements(locator);
		return elements;
	}
	
	public static void doLinkClick(By locator,String value)
	{
		List<WebElement> ele = getElements(locator);
		
		for(int j=0;j<ele.size();j++)
		{
			if(ele.get(j).getText().equals(value))
			{
				ele.get(j).click();
				break;
			}
		}
		
	}

}
