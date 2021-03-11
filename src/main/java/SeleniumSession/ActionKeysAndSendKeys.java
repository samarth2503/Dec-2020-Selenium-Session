package SeleniumSession;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeysAndSendKeys {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		
		Actions ac = new Actions(driver);
		
		ac.keyDown(driver.findElement(By.id("divUsername")), Keys.SHIFT).sendKeys("admin").keyUp(Keys.SHIFT).perform();
		
//		ac.sendKeys(driver.findElement(By.id("divUsername")), "admin").perform();
//		
//		ac.keyUp(driver.findElement(By.id("divUsername")), Keys.SHIFT).perform();
//		
//		ac.
	
		Robot r = new Robot();
		
		//r.keyPress();
		
		
	}

}
