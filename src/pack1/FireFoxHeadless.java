package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class FireFoxHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		WebElement curdrop=driver.findElement(By.id("ctl00_mainConten"));
		// classname obj = new classname();
		
		Select sc= new Select(curdrop);
		
		//sc.selectByIndex(2);
		//sc.selectByVisibleText("USD");
		//sc.selectByValue("BDT");
		int dropsize=sc.getOptions().size();
		System.out.println(dropsize);
		
		for(int i =0;i<dropsize;i++) {
			
			
			String itemstext=sc.getOptions().get(i).getText();
			System.out.println(itemstext);
			
			
		}
		
		
		
		

	}

}
