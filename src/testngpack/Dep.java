package testngpack;

import org.testng.annotations.Test;

public class Dep {

	@Test (dependsOnMethods = {"test2"})
	public static void test1() {
		
		System.out.println("test 1");
		
	}
	
	@Test
	public static void test2() {
		
		System.out.println("test 2");
		
	}
	
	
}
