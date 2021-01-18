package humanpackage;

//classes contains intructions on how objects can be created or how they behave in the application
//specs/ design of human class
//defines characteristics of the human
//define some basic behaviours

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	//THEN CREATE THE HUMAN ITSELF
	//CONSTRUCT THE OBJECT
	//CONSTRUCTOR METHODS ALWAYS HAVE THE SAME NAME AS YOUR CLASS NAME
	
	//This is the CONSTRUCTOR METHOD FOR HUMAN
	public Human() {
		
	}
	
	
	////define some basic behaviours by creating methods
	public void speak(){
		System.out.println("hello my name is " + name);
		System.out.println("my height is " + heightInInches);
		System.out.println("i am  " + age);
		System.out.println("eye color " + eyeColor);
	}
	
	public void eat() {
		System.out.println("eating ....");
	}
	
	public void sleep() {
		System.out.println("sleeping ....");
	}
	
	public void work() {
		System.out.println("working ....");
	}
	
}





