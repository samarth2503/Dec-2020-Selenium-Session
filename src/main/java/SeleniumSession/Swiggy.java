package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.swiggy.com");
		
		driver.findElement(By.id("location")).sendKeys("Electronic City");
		
		Actions ac = new Actions(driver);
		
		Thread.sleep(2000);
		
		WebElement el = driver.findElement(By.xpath("(//div[@class='_1oLDb']//span[@class='_2W-T9'])[2]"));
		
		ac.moveToElement(el).click().perform();
		
		Thread.sleep(5000);
		
		WebElement header = driver.findElement(By.cssSelector(".BZR3j"));
		
		int count = Integer.valueOf(header.getText().split(" ")[0]);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='nA6kb']"));
		int res = ele.size();
		while(count!=res)
		{
		//	List<WebElement> ele = driver.findElements(By.xpath("//div[@class='nA6kb']"));
			
			
			for(WebElement e :ele)
			{
				System.out.println("Restuarant is "+e.getText());
				
			}
			ele=null;
			doScrollDown(driver);
			
			ele = driver.findElements(By.xpath("//div[@class='nA6kb']"));
			int a = ele.size();
			res+=a;
			
			System.out.println("-------------------");
			System.out.println("List of Element is "+res);
			System.out.println("-------------------");
		}
	}
	
	public static void doScrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public static void ScrollDown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)",element);
	}

}
