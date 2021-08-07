package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assetexampl2 {

	@Test
	public static void spc() {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		 boolean aftermcity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation2_CTXT")).isDisplayed();
		 
		 //Assert.assertEquals(aftermcity, true);
		 Assert.assertTrue(aftermcity);
		 
	}

}
