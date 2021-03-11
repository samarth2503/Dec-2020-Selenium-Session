package TestngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest{
	
	@Test(priority=1)
	public void titleTest()
	{
		
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
