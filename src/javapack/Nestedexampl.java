package javapack;

public class Nestedexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tlimit =2;
		int amount=50000;
		
		if(tlimit <=3) {
			
			System.out.println("Enter amount");
			
			
			
			if(amount<=10000) {
				
				System.out.println("Cash out !!!!");
				
			}
			else {
				
				System.out.println("max limit per transaction is 10k only");
				
			}
			
			
			
		}else {
			
			
			System.out.println("number of transaction exceeded ");
			
		}
		
		

	}

}
