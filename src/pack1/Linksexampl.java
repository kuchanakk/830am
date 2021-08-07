package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linksexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//object for firefoxdriver class // plain firefefix opened 

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		int linkcount=driver.findElements(By.tagName("a")).size();
		
		for(int i=0;i<linkcount;i++) {
			
			String linktext=driver.findElements(By.tagName("a")).get(i).getText();
			String href=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			
			System.out.println(i +"  index number link has text ******* "+linktext+"*****  and href = ****** "+href+" ******");
			
			
		}
		
		
		
		

	}

}
