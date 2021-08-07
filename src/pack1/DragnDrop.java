package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement dropitem=driver.findElement(By.id("droptarget"));
		WebElement dragitem=driver.findElement(By.id("draggable"));
		Actions ac = new Actions(driver);
		//ac.dragAndDrop(dragitem, dropitem).build().perform();
		ac.clickAndHold(dragitem).moveToElement(dropitem).release().build().perform();
		
		
		
	}

}
