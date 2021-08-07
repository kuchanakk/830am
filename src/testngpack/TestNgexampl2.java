package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgexampl2 {
	
	static WebDriver driver ;

	@BeforeTest
	public static void teststart() {
		
		System.out.println("******Test Started***********");
		
	}
	
	@BeforeMethod
	public static void openbrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		  driver = new FirefoxDriver();
		
	}
	
	@Test
	public static void amzon() {
		
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());
		
	}
	
	@Test
	public static void facebok() {
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());

		
	}
	
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
	}
	
	
	@AfterTest
	public static void testend() {
		
		System.out.println("******Test ended***********");
		
	}
	
}
