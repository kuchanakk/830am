package packobjrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagewebelment {
	
	static WebDriver driver;
	
	public HomePagewebelment(WebDriver driver) {
		
		this.driver=driver;
		
		
	}

	
	static By loginicon=By.id("menuUser");
	static By name=By.name("username");
	static By pwd=By.name("password");
	static By sig=By.id("sign_in_btnundefined");

	
	public static WebElement loginlink() {
		
		return driver.findElement(loginicon);
		
	}
	
	
	public static WebElement username() {
		
		return driver.findElement(name);

		
	}

	public static WebElement password() {
	
	return driver.findElement(pwd);
	
	
}

	public static WebElement signin() {
	
	return driver.findElement(sig);
	
	
}

		

}
