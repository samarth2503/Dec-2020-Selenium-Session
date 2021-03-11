package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		//Locators:
		
		// 1st Method
		driver.findElement(By.id("input-email")).sendKeys("Samarth");
		driver.findElement(By.id("input-password")).sendKeys("Sam@123");
		
		//2nd Methdo:- Using WebElement as holding refernce
		
		//WebElement email = driver.findElement(By.id("input-email"));
		//email.sendKeys("Samarth");
		
		//3rd Method:- Using By Loacator
		
		By email = By.id("input-email");										// By is class and id is static method
		By password = By.id("input-password");
		
		//4th Method :- Using Wrapper method
		getElement(email).sendKeys("Samarth");
		
		//5th Method
		doSendKeys(email,"Samarth");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}

}
