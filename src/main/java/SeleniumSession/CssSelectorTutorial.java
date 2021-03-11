package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorTutorial {
	
	static WebDriver driver;
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		// id --> id#txtUsername  or  #txtUsername  or //tag[attr='value']
		driver.findElement(By.cssSelector("id#txtUsername")).sendKeys("admin");
		driver.findElement(By.cssSelector("#divPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[id='btnLogin']")).click();
		
		// And in css selector
		
		driver.findElement(By.cssSelector("input[id='username'][type='email']")).sendKeys("Samarth");
		
		// tag.c1.c2.c3 ----> multiple classname
		driver.findElement(By.cssSelector(".form-control private-form__control login-password m-bottom-3"));
		driver.findElement(By.cssSelector("input.form-control private-form__control login-password m-bottom-3"));
		driver.findElement(By.className("form-control private-form__control login-password m-bottom-3"));			// Wrong xpath there cant be multiple class name
		
		// start-with
		driver.findElement(By.cssSelector("input[id^='user']"));
		
		//contains
		driver.findElement(By.cssSelector("input[id*='user']"));
		
		//ends with
		driver.findElement(By.cssSelector("input[id$='name']"));
		
		// parent to child
		
		driver.findElement(By.cssSelector("div.private-form__input-wrapper input"));                  // direct and indirect in css
		driver.findElement(By.cssSelector("div.private-form__input-wrapper>input"));					// direct child in css 
		
		driver.findElement(By.xpath("//div[@class='private-form__input-wrapper']//input"));				//   direct + indirect child in xpath
		driver.findElement(By.xpath("//div[@class='private-form__input-wrapper']/input"));				// direct child in xpath
		
		// To get multiple element using css
		
		driver.findElement(By.cssSelector("ul.footer-nav li"));											// 31 direct and indirect li elements
		driver.findElement(By.cssSelector("div.list-group a:nth-of-type(5) "));
	
		// To move to specific element from multiple element in css
		
		driver.findElement(By.cssSelector("ul.footer-nav a"));
		
		
		// following-sibling in css selector
		
		driver.findElement(By.cssSelector("div.private-form__input-wrapper + div"));								// ---> css
		driver.findElement(By.xpath("//div[@class='private-form__input-wrapper']//following-sibling::div"));		// --> xpath
		
		// comma in css Selector
		
		By loginformelement = By.cssSelector("input#input-email,input#password, button#loginBtn");
		
		List<WebElement> loginele = driver.findElements(loginformelement);
		
		int size = loginele.size();
		
		if(size==4)
		{
			System.out.println("All the elements are present");
		}
		
		
		
	}
	
	
	// id ---> #{id}
	// class ---> .class
	// #username
	// .login-email
	// .c.c2.c3...cn
	
	// tag#id	 	------> input#username
	// tag.c1.c2.c3 ------> input.form-control private-form__control login-email
	// tag.class    ------> input.form-control
	// class and id combinaton -----> input#username.login-email
	
	// input[id='username']-----> tag[attr=value]---->css
	// input[@id='username'] -----> xpath
	
	/* And in css */
	
	// tag[attr1='value'][attr2='value']-------> input[id='username'][type='email']
	
	/* contains in css */
	
	// tag[attr*='user']-----> input[id*='user']
	
	/* starts-with in css */
	
	// tag[attr^='value']-----> input[id^='user']
	
	/* ends with in css */
	
	// tag[attr$=value] ------> input[id$='user']
	
	// Parent to child
	
	// //input[@id="username"]/ancestor::form ----> in xpath
	
	// div.private-form__input-wrapper    ------> in css
	
//	By loginForm = By.cssSelector("input#input-email,input#password,button#loginbtn");
//	
//	int impelement = d

}
