package SeleniumSession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptPopupHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		/*driver.findElement(By.cssSelector(".signinbtn")).click();
		
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println("Text is "+al.getText());
		
		al.accept(); */
		
		
		
		Actions ac = new Actions(driver);
		
		/*ac.moveToElement(driver.findElement(By.cssSelector("div.logtext"))).click().perform();
		
		//ac.doubleClick(driver.findElement(By.cssSelector("div.logtext"))).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		/*r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		
		driver.findElement(By.id("login1")).sendKeys("samarth"); */
		
		
	}

}
