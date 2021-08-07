package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ADviui {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		WebElement account=driver.findElement(By.id("nav-link-accountList"));
		//Thread.sleep(10000);
		Actions ac = new Actions(driver);
		//ac.moveToElement(account).build().perform();
		//ac.moveToElement(driver.findElement(By.id("nav-link-prime"))).build().perform();
		//ac.contextClick().build().perform();
		ac.contextClick(account).build().perform();

	}

}
