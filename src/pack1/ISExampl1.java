package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ISExampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		/*
		 * boolean beforemcity=driver.findElement(By.id(
		 * "ctl00_mainContent_ddl_originStation2_CTXT")).isDisplayed();
		 * System.out.println(" before clicking on multy city = "+beforemcity);
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		 * 
		 * boolean aftermcity=driver.findElement(By.id(
		 * "ctl00_mainContent_ddl_originStation2_CTXT")).isDisplayed();
		 * System.out.println(" after clicking on multy city = "+aftermcity);
		 */
		
		
		/*
		 * int
		 * esize=driver.findElements(By.id("ctl00_mainContent_ddlbnbnbbgvg")).size();
		 * System.out.println(esize);
		 */
		
		
		boolean ff=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		
		
		if(ff==false) {
			
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			
		}
		
		
	}

}
