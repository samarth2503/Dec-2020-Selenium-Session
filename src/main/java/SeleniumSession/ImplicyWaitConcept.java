package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicyWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		try {
			driver.findElement(By.name("q11")).sendKeys("Naveen");
		}
		catch(Exception e)
		{
			long end = System.currentTimeMillis();
			System.out.println(end-start);
		}
		
		
	
		

	}

}
