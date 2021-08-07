package pack1;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HtmlUnitDriver unitdriver= new HtmlUnitDriver();
		
		unitdriver.get("http://www.facebook.com");
		
		System.out.println(unitdriver.getTitle());
		
		unitdriver.close();
	}

}
