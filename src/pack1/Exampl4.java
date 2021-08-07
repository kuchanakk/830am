package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exampl4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("kiran");
		
	}

}
