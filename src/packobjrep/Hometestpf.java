package packobjrep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hometestpf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/n");
		
		Homepagepf hpf = new Homepagepf(driver);
		Thread.sleep(10000);
		hpf.loginlink().click();
		hpf.username().sendKeys("kirank");
		hpf.password().sendKeys("0123456kK");
		Thread.sleep(5000);
		hpf.signin().click();
		
		
		
	
	}

}
