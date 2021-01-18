package examples;

public class VariablesExamples {
	
	public static void main(String[] args) {
	
		boolean myBoolean = false;
		
		byte myByte = 2;
		
		short myShort = 3;
		
		char myChar = 'b';
		
		int myInt = 5;
		
		float myFloat = 0.25f;
		
		long myLong = 9999999999L;
		
		double myDouble = 5.999d;
		
		String myString = new String("this is a new string created with a constructor");

		
		System.out.println("2 + 3 = " + (myByte + myShort));
		
		myBoolean = myInt < 6;
		
		System.out.println(" is myInt < 6 " + myBoolean);
		
		
		
		//to check the max and min values
		int myMinInt = Integer.MIN_VALUE;
		int myMaxInt = Integer.MAX_VALUE;
		
		//if you try to add to the max value it will overflow
		
		
		System.out.println(myMinInt + " and " + myMaxInt);
		
		
		//Byte - 8bit width 8
		//short - 16bit width 16
		//int - 32bit width 32
		//certain datatypes occupy/ takes up more space than others
		
	}
	
}
