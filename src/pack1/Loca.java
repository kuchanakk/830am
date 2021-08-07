package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		//id
		//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		//name
		//driver.findElement(By.name("pass")).sendKeys("hjhjhjh");
		//linkext
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//plinktext
		//driver.findElement(By.partialLinkText("Create a")).click();
		//tagname
		//int linksize=driver.findElements(By.tagName("a")).size();
		//System.out.println("totl number of links in fb page = "+ linksize);
		//class
		//int val1=driver.findElements(By.className("inputtext")).size();
		
		//System.out.println(val1);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kirank");
		driver.findElement(By.cssSelector("#pass")).sendKeys("vgvgv");
	}

}
