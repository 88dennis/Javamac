package examples;

public class SwitchExample {

	public static void main(String[] args) {
		
		int day = 2;
		
		switch(day) {
		
		case 1: System.out.println("Sunday");
			break;
		case 2: System.out.println("Mon");
			break;
		case 3: System.out.println("Tue");
			break;
		case 4: System.out.println("Wed");
			break;
		default: System.out.println("Invalid Day");
			break;
		
		}

	}

}
