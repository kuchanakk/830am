package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Prltest1 {
	
	
static WebDriver driver;
	
	@Test
	public static void amzon() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");

		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
	System.out.println(driver.getTitle());
		
	}

	
	@Test
	public static void facbook() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");

		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
		
		
		
	}
}
