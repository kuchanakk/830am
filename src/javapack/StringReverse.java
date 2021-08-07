package javapack;

public class StringReverse {

	static String val="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
		 * String s[]= {"selenium","qtp","manual testing"} ;
		 * 
		 * System.out.println(s[2])
		 */;
		String s ="selenium"; 
		
		System.out.println(val);
		for(int i=s.length()-1;i>=0;i--) {
			
			char ch=s.charAt(i);
			

			val=val+ch;
			
		
		}

		System.out.println(val);
		
		
		 
		 

	}

}
