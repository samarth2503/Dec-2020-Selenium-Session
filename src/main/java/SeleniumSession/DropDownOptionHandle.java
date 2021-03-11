package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class Example{
	
	int a;
	String name;
	
	
}
public class DropDownOptionHandle {
	
	//public static WebDriver driver;
	
	public static void main(String[] args) {
		
		/*WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.xpath("//select[@id=\"Form_submitForm_Industry\"]");
		By country = By.id("Form_submitForm_Country");
		 
		Select select_indus = new Select(driver.findElement(industry));
		
		List<WebElement> indus_opt = select_indus.getOptions();
		
		for(WebElement e : indus_opt)
		{
			System.out.println(e);
		}*/
		
		Example e = new Example();
		
		System.out.println("Name is "+e.name+" and intger is "+e.a);

	}

}
