package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();

		driver.get("https://training.testifi.io/login");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("mat-input-\\*")).getAttribute("id"));
		System.out.println(driver.findElements(By.xpath("//p[@class='ng-tns-c188-0']")).size());
		//System.out.println(driver.findElement(By.xpath("//*[@classname='ng-tns-c188-0' and @id='login__toregister']")).getAttribute("text"));
		//System.out.println(driver.findElement(By.className("ng-tns-c188-0")).getText());
		//System.out.println(driver.findElements(By.xpath("//*[@tagName='p']")).size());
		//System.out.println(driver.findElement(By.xpath("//*[@id='login__toregister' and @class='ng-tns-c188-0']")).getText());

	}

}
