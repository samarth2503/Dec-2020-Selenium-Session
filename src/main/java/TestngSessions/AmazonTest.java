package TestngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	
	
	@Test(priority=1)
	public void titleTest()
	{
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=2)
	public void logoTest()
	{
		boolean act = driver.findElement(By.cssSelector("#nav-logo-sprites")).isDisplayed();
		Assert.assertTrue(act);
	}
	
	@Test(priority=3)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("Amazon"));
	}
	
	
	
	

}
