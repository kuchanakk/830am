package packobjrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagepf {
	
	
static WebDriver driver;
	
	public Homepagepf(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@findBy(att="value") static Webelement name;
	@FindBy(id="menuUser") static WebElement menu;
	@FindBy(name="username") static WebElement user;
	@FindBy(name="password") static WebElement pwd;
	@FindBy(id="sign_in_btnundefined") static WebElement login;

	
	
public static WebElement loginlink() {
		
		return menu;
		
		
	}
	
	
	public static WebElement username() {
		
		return user;
		
		
	}

	public static WebElement password() {
	
	return pwd;
	
	
}

	public static WebElement signin() {
	
	return login;
	
	
}
	
	
	
	

}
