package javapack;

public class Primenumberexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n=5;
		int c=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				
				c++;
				
				if(c==2) {
					
					
					System.out.println(n+" is a prime number");
				}
				else {
					
					System.out.println(n+" is a not a prime number");

				}
				
			}
			
			
		}

	}

}
