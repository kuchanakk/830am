package testngpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parmtr {
	
	@Test
	@Parameters("browser")
	public static void pr(String browser) {
		
		System.out.println(browser);
		
	}
	
	

}
