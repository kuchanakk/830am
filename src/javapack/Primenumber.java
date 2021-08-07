package javapack;

public class Primenumber {
	
	
	
	public static void primenumber(int inputnumber) {
		
		int count= 0;
		
		for(int i=1;i<=inputnumber;i++)  
			
			if(inputnumber % i == 0) 
				
				count++;
				
				if(count==2) {
					
					
					System.out.println(inputnumber +" is a prime number");
 				}
				
			
			
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for(int i=2;i<=100;i++) {
			
			primenumber(i);
			
		}
		
		
	}

}
