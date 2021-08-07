// this lets is to open facebook in firefox browser
// CLass1 

package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxexampl {

	public static void main(String[] args) {
		//infromation of driver location
System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
//object for firefoxdriver class // plain firefefix opened 

WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.amazon.in");
   	 String title=driver.getTitle();// get current title	
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());

	driver.close();
	
	

	}

}
