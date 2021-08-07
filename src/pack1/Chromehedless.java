package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromehedless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver91\\chromedriver.exe");
		
		//Step 1: creating object of Chromeoptions
		
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		// headless argument
		//Step 2
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		int linkcount=driver.findElements(By.tagName("a")).size();
		
		for(int i=0;i<linkcount;i++) {
			
			String linktext=driver.findElements(By.tagName("a")).get(i).getText();
			String href=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			
			System.out.println(i +"  index number link has text ******* "+linktext+"*****  and href = ****** "+href+" ******");
		
			
			
			
		}	

	}

}
