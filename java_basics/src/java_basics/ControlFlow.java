package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comes from the if and else statements
		
		boolean hungry = true;
		
		//you can also do if(hungry == true
		//2 < 2 is false
		//if(evaluated is true, then it will run the code after)
		if(2 == 2) {
			
			System.out.println("Im starving");
			
		} else {
			
			System.out.println("Im not hungry");
			
		}
		
		int hungerRating = 5;
		
		if(!(hungerRating < 6)) {
			
			System.out.println("not hungry");
		} else {
			
			System.out.println("starving");
			
		}
		
		int favTemp = 75;
		
		int currentTemp = 100;
		
		String opinion;
		
		if(currentTemp == favTemp) {
			if(currentTemp < favTemp - 30) {
				opinion = "Its pretty cold";
			} else if(currentTemp < favTemp - 20) {
				opinion = "its kinda cold";
			} else if(currentTemp > favTemp +10) {
				
				opinion = "its hot out";
			} else {
				opinion = "its great out";
			}
		
		} else {
			//YOU SHOULD OUT ELSE STATEMENT  BECAUSE THE VARIABLE "opinion" has no assigned value
			opinion = "unknown temp";
		}
		System.out.println(opinion);
		
		
		int month = 2;
		
		String monthString;
		
		//switch has cases
		//the parameter is the month
		switch(month) {
		
		//the number 1 is the value of the month of the case
		//like this: if case = 1 then monthString = "Jan"
		//each one of the cases will be compared with the variable's value
		
		case 1: monthString = "january";
			//the break keyword will exit the code outside the switch method
			break;
			
		case 6: monthString = "june";
			break;
			
		default: monthString = "Unknown Month";
				break;
		
		}
		
		System.out.println(monthString);
		
		
	}

}
