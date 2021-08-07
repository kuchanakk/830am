package javapack;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	try {
		
		
		//String s=null;
		//System.out.println(s.length());
		
		int a=10;
		int b=2;
		int c =a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		
		System.out.println(" excp handl'd  "+e);
		
	}
	
	catch(NullPointerException e) {
		
		System.out.println(" null pointer exception ");
		
	}
	
	finally {
		
		System.out.println("Finally block...");
		
	}
	}

}
