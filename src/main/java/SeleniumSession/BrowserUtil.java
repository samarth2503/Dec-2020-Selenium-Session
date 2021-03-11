package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	
	// Generic Wrapper method
	
	WebDriver driver;
	
	/**
	 * This method is used for initalizing WebDriver on basis of browser
	 * @param browser
	 * @return WebDriver
	 */
	public WebDriver launchBrowser(String browser)
	{
		System.out.println("Launching the browser "+browser);
		switch(browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "safari":	
			driver= new SafariDriver();
			break;
		default:
			System.err.println("Browser "+browser+" is not Found.....");
			break;
		}
			
		return driver;	
	}
	
	/**
	 * This method is used for navigating to website
	 * @param url
	 */
	public void launchUrl(String url)
	{
		if(url.isEmpty())
		{
			return;								// Equivalent to void
		}
		driver.get(url);
	}
	
	/**
	 * This method is used to get URL of Current page
	 * @return
	 */
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method is used to Quit the browser
	 */
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	/**
	 * This method is used for closing browser
	 */
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	/**
	 * This method will fetch the Page Title
	 */
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	

}
