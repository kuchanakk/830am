package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Privatewind {

	//static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver91\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com");
		
		
		

	}

}
