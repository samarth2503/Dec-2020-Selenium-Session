package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCartTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser(browser);
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		
		//By locators
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cnfpwd = By.id("input-confirm");
		By policy = By.name("agree");
		By Continue = By.xpath("//input[@value=\'Continue\']");
		
		ElementUtil el = new ElementUtil(driver);
		
		el.doSendKeys(firstname, "Samarth");
		el.doSendKeys(lastname, "Jain");
		el.doSendKeys(email, "samarthjain680@gmail.com");
		el.doSendKeys(pwd, "Samarth@2503");
		el.doSendKeys(cnfpwd, "Samarth@2503");
		
		if(el.doIsDisplayed(policy))
		{
			el.doClick(policy);
		}
		
	}

}
