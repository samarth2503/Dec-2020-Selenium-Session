package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropDownHandle {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.xpath("//select[@id=\"Form_submitForm_Industry\"]");
		By country = By.id("Form_submitForm_Country");
		
		WebElement indus_ele = driver.findElement(industry);
		
		Select s = new Select(indus_ele);
		
		s.selectByIndex(5);															// Can be used for dropdw where values are fixed( Eg:- Month,day,week
		s.selectByVisibleText("Education");
		s.selectByValue("Eduaction");									
		
	}
	
	public static WebElement getElement(By locator)
	{
		try {
			return driver.findElement(locator);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public static void doselectByvisisbleText(By locator,String text)
	{
		WebElement ele = getElement(locator);
		Select s = new Select(ele);
		s.selectByVisibleText(text);
		
	}
	
	public static void doselectByvalue(By locator,String value)
	{
		WebElement ele = getElement(locator);
		Select s = new Select(ele);
		s.deselectByValue(value);
	}
	
	public static void doselectByIndex(By locator,int i)
	{
		WebElement ele = getElement(locator);
		Select s = new Select(ele);
		s.deselectByIndex(i);
	}
	
	public static List<String> getDropdownOptionList(By locator)
	{
		WebElement ele = getElement(locator);
		
		Select s = new Select(ele);
		
		List<WebElement> element = s.getOptions();
		
		List<String> optionList = new ArrayList<String>();
		
		for(WebElement e : element)
		{
			optionList.add(e.getText());
		}
		return optionList;
	}
	
	public static List<String> getDropdownOptionList(By locator,String tag)
	{
		WebElement ele = getElement(locator);
		
		Select s = new Select(ele);
		
		List<WebElement> element = s.getOptions();
		
		List<String> optionList = new ArrayList<String>();
		
		for(WebElement e : element)
		{
			optionList.add(e.getText());
		}
		return optionList;
	}


}

