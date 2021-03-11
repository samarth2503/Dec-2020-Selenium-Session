package SeleniumSession;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		String browsername = "chrome";
		
		BrowserUtil bw = new BrowserUtil();
		bw.launchBrowser(browsername);
		bw.launchUrl("https://www.amazon.in/");
		
		
		if(bw.getPageTitle().contains("Online Shopping"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("InCorrect Title");
		}
		
		
	}

}
