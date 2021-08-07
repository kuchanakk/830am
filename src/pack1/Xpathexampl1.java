package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathexampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Create New Account")).click();
		//int rbsize=driver.findElements(By.xpath("//input[@type='radio']")).size();
		//System.out.println(rbsize);
		//driver.findElement(By.xpath("//a[contains(@id ,'u_0_2_' )]")).click();
		
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy' and @id='u_0_2_2F']")).click();

	}

}
