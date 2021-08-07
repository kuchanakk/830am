package packobjrep;

import org.openqa.selenium.By;

public class Homepage {
	
	
	static By loginicon=By.id("menuUser");
	static By name=By.name("username");
	static By pwd=By.name("password");
	//By sig=By.id("sign_in_btnundefined");

	
	public static By loginlink() {
		
		return loginicon;
		
		
	}
	
	
	public static By username() {
		
		return name;
		
		
	}

	public static By password() {
	
	return pwd;
	
	
}

	public static By signin() {
	
	return By.id("sign_in_btnundefined");
	
	
}
	
	
	
	
	

}
