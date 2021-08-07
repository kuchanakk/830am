package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://addtext.com/");
		driver.findElement(By.xpath("//*[@id=\"html\"]/body/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]")).click();
		java.lang.Runtime.getRuntime().exec("‪C:\\Users\\kiran\\Desktop\\upload.exe");
		
	}

}
