package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		selectDate("June",15);
		
		Thread.sleep(5000);
		
		//driver.quit();

	}
	
	public static void selectDate(String month,int day) throws InterruptedException
	{
		String current_month = driver.findElement(By.cssSelector(".ui-datepicker-title span.ui-datepicker-month")).getText().trim();
		System.out.println("Current Month is "+current_month);
		int curr_mon=selectMonth(current_month);
		System.out.println("Current Month is "+curr_mon);
		int mon=selectMonth(month);
		System.out.println("Month is "+mon);
		
		while(curr_mon!=mon)
		{
			if(curr_mon>mon)
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			
			Thread.sleep(2000);
			current_month = driver.findElement(By.cssSelector(".ui-datepicker-title span.ui-datepicker-month")).getText();
			curr_mon=selectMonth(current_month);
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'"+day+"')]")).click();
		
		String date = driver.findElement(By.id("datepicker")).getAttribute("value");
		
		System.out.println("Date is "+date);
		
	}
	
	public static int selectMonth(String month)
	{
		String[] mon = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int count=1;
		
		for(String m : mon)
		{
			if(m.equals(month))
			{
				break;
			}
			else
			{
				count++;
			}
		}
		return count;
	}
	
//	public void selectDate(int day)
//	{
//		driver.findElement(By.xpath(""))
//	}

}
