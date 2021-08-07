package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assrtexampl1 {
	
	@Test
	public static void fb() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String actualt=driver.getTitle();
		String expectt = "Facebook – log in";
		
		//Assert.assertEquals(actualt, expectt);
		//System.out.println("after assert");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualt, expectt);
		System.out.println("after assert");

		sa.assertAll();
		
		
	}
	
	@Test
	public static void nextest() {
		
		System.out.println("Script in nexttest");
		
	}
	
	
	
	

}
