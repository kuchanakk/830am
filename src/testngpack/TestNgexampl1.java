package testngpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgexampl1 {
	
	
	@Test(priority=0)
	public static void login() {
		
		
		System.out.println("login script------@Test");
			
	}
	

	@Test(priority=1)
	public static void compemail() {
		
		System.out.println("com e mail script--------@Test");
	}
	
	
	@Test(priority=2)
	public static void delemail() {
		
		System.out.println("del email script------@Test");
	}
	
	
	@BeforeTest
	public static void openbrowser() {
		System.out.println("opne browser-----@Beforetest");
		
	}
	
	@AfterTest
	public static void closebrowser() {
		System.out.println("close browser-----@Aftertest");
		
	}
	
	@BeforeMethod
	public static void beforemethod() {
		
		System.out.println("before method script-----@Before method");
		
	}
	
	
	@AfterMethod
	public static void aftermethod() {
		
		System.out.println("before method script-----@After method");
		
	}
	
}
