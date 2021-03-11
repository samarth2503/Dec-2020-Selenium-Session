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
		
		int count = 383;
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='nA6kb']"));
		int c=1;
		int a = ele.size();
		while(true)
		{
			for(WebElement e :ele)
			{
				
				System.out.println("Element count is "+a);
				ScrollDown(driver,e);
				a=a+ele.size();
				System.out.println("Restuarant is "+e.getText()+"count is "+(c+1));
			}
			
			break;
		}
	}
	
	public static void doScrollDown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView(true)",element);
	}
	
	public static void ScrollDown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)",element);
	}

}
