package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		By login = By.id("ctl00_HyperLinkLogin");
		By spiceclub = By.partialLinkText("SpiceClub Members");
		By memberlogin = By.linkText("Member Login");
		
		
		doMoveToElement(login,spiceclub,memberlogin);
		

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	// 2 level click
	public static void doMoveToElement(By locator)
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(getElement(locator)).perform();
	}
	
	// 3 level click
	public static void doMoveToElement(By locator1,By locator2)
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(getElement(locator1)).perform();
		ac.moveToElement(getElement(locator2)).perform();
	}
	
	// 3 level with click
	public static void doMoveToElement(By locator1,By locator2,By locator3)
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(getElement(locator1)).perform();
		ac.moveToElement(getElement(locator2)).perform();
		getElement(locator3).click();
	}
	
	public static void doActionclick(By locator)
	{
		Actions ac = new Actions(driver);
		ac.click(getElement(locator));								// It will click on middle of the element
	}
	
	public static void doActionSendKeys(By locator,String text)
	{
		Actions ac = new Actions(driver);
		ac.sendKeys(getElement(locator), text).perform();						// Actions class sendKeys will first perform click action on text feild and them enter the text
	}

}
