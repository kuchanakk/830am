package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyadviui {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		WebElement fname=driver.findElement(By.name("firstname"));
		Actions ac = new Actions(driver);
		ac.moveToElement(fname).sendKeys("kiran").sendKeys(Keys.TAB).sendKeys("kkk").sendKeys(Keys.TAB).sendKeys("76767").build().perform();
		
		
		
		
		

	}

}
