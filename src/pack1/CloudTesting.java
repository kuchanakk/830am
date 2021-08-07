package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloudTesting {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		 String username = "cc10151%40office365.beer"; // Your username
		     String authkey = "u9079b915c2cd51c";  // Your authkey
		    String testScore = "unset";
		
	        DesiredCapabilities caps = new DesiredCapabilities();
	        
	        caps.setCapability("browserName", "Chrome");
	        caps.setCapability("deviceName", "Pixel 4");
	        caps.setCapability("platformVersion", "10.0");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("deviceOrientation", "portrait");

		    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://" + username + ":" + authkey +"@hub.crossbrowsertesting.com:80/wd/hub"), caps);
		
	      
	        			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			
			
	}

}
