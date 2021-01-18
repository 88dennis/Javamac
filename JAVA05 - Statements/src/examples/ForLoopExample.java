package examples;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for(int count = 1; count <= 10; count++) {
			
			System.out.println(count);
			
		}
		
		System.out.println("We Have Exited The FOR Loop");
		
		
		int count = 1;
		while(count <11) {
			System.out.println(count);
			count++;
		}
		
		System.out.println("We Have Exited The WHILE Loop");
		
		
		int num = 0; 
		
		while(num <= 10) {
			
			num++;
			
			if(num == 9) {
				break;
			}
			
			if(num % 2 == 0 ) {
				continue;
				
			} else {
				
				System.out.println(num);
			}
			
			
		}
		
		System.out.println("We Have Exited The WHILE Loop");

	}

}
