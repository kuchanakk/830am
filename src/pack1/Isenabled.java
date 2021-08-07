package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		Thread.sleep(10000);
		driver.findElement(By.id("menuUser")).click();
		boolean beforeentr=driver.findElement(By.id("sign_in_btnundefined")).isEnabled();
		System.out.println(beforeentr);
		driver.findElement(By.name("username")).sendKeys("kirank");
		driver.findElement(By.name("password")).sendKeys("0123456kk");
		
		boolean after=driver.findElement(By.id("sign_in_btnundefined")).isEnabled();
		System.out.println(after);
		
	}

}
