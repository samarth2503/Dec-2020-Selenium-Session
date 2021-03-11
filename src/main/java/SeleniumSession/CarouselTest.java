package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarouselTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.noon.com/uae-en/");
		
		String next_button = "//h3[text()='Health care essentials']//parent::div/../following-sibling::div//div[contains(@class,'swiper-button-next')]";
		
		// "//h3[text()='Health care essentials']/../parent::div/following-sibling::div//div[contains(@class,'swiper-button-next')]"
		List<WebElement> ele = driver.findElements(By.xpath("//h3[text()='Health care essentials']/../parent::div/following-sibling::div//div[@data-qa='product-name']"));
		
		Set<String> dataset = new TreeSet<String>();
		Thread.sleep(1000);
		while(!driver.findElement(By.xpath(next_button)).getAttribute("class").contains("swipper-button-disabled"))
		{
			for(WebElement e : ele)
			{
				dataset.add(e.getText());
			}
			
			driver.findElement(By.xpath(next_button)).click();
		}
		
		List<String> data = new ArrayList<String>(dataset);
		
		data.stream().forEach(e->System.out.println(e));
	}

}
