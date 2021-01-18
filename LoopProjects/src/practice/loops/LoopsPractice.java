package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		while(true) {
//			do something
//		}
		
		//initialize something
		int count = 0;
		
		while(count <=100) {
			System.out.println("Dennis: " + count);
			
			//you need to CHANGE the VALUE OF COUNT
			
			count = count + 1;
			
			//in some cases you may break the loop using break
			if(count == 30) {
				break;
			}
		}
		
		
		
		

	}

}
