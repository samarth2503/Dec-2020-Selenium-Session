package TestngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicCrmTest extends BaseTest{
	
	@Test(priority=1)
	public void titleTest()
	{
		driver.get("https://classic.crmpro.com/");
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void logoTest()
	{
		boolean act = driver.findElement(By.cssSelector("#divLogo>img")).isDisplayed();
		Assert.assertTrue(act);
	}

}
