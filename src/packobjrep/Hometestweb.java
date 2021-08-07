package packobjrep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hometestweb  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/n");
		
		HomePagewebelment hp = new HomePagewebelment(driver);
		Thread.sleep(10000);
		hp.loginlink().click();
		hp.username().sendKeys("kirank");
		hp.password().sendKeys("0123456kK");
		
		Thread.sleep(5000);

		hp.signin().click();

	}

}
