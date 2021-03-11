package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImgaes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		
		System.out.println("Number of image present in Page is : "+imgList.size());
		
		for(WebElement a : imgList)
		{
			System.out.println("Image name is "+a.getAttribute("alt")+" images link is "+a.getAttribute("src"));
		}
		
	}

}
