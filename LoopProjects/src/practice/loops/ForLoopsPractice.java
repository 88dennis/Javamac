package practice.loops;

public class ForLoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FOR LOOP - do something over and over again for something

//		for( int i = 0; i < 100; i++) {
//			
//			//first part initialization; only happens once
//			//second part test 
//			//third is the increment
//			//i = i + 1
//			
//			System.out.println("i: " + i);
//		}
//		
//		
//		String name = "dennis sarmiento";
//		
//		for(int i = 0; i < name.length(); i++) {
//			
//			System.out.println("char: " + name.charAt(i));
//		}
//
//		
//		System.out.println("====================");
//		
//		//BACKWARDS
//		for(int i = name.length() -1; i >= 0; i = i - 1) {
//					
//					System.out.println("char: " + name.charAt(i));
//		}
//		
//
//		//EVEN
//		for( int i = 0 ; i <= 100; i++) {
//			
//			if(i % 2 == 0) {
//				
//				System.out.println(i);
//				
//			}
//		}
//		
//		
//		for( int i = 0 ; i <= 100; i+=2) {
//			
//				System.out.println(i);
//				
//		}

		int counter = 0;

		for (int i = 0; i <= 100; i = i + 1) {

			System.out.println(i);

			int temp = counter + 1;
			counter = temp;

		}

	}

}
