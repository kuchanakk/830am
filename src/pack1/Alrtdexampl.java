package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alrtdexampl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		/*
		 * driver.findElement(By.name("B2")).click(); Thread.sleep(5000); String
		 * text=driver.switchTo().alert().getText(); System.out.println(text);
		 * driver.switchTo().alert().accept();
		 */
		
		/*
		 * driver.findElement(By.name("B3")).click();
		 * driver.switchTo().alert().dismiss();
		 */
		
		/*
		 * driver.findElement(By.name("B4")).click();
		 * driver.switchTo().alert().sendKeys("kiran");
		 * driver.switchTo().alert().accept();
		 */

		
		
		
	}

}
