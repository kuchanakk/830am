package javapack;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;


public class Advuikeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement srchbox=driver.findElement(By.id("twotabsearch"));
		Actions ac = new Actions(driver);
		ac.keyDown(srchbox, Keys.SHIFT).sendKeys("iphone").keyUp(Keys.SHIFT).sendKeys(" case").build().perform();
		
		}
		catch (NoSuchElementException em) {
			
			System.out.println(" No such element at " + em);
			
		}
		
		
		
		
	}

}
