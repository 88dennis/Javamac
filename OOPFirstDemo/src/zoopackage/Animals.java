package zoopackage;

public class Animals {
	
	//initialize the declaration of variables to be used in your object creation and method creation
	//These are also called FIELDS OR ATTRIBUTES aside from being called variables and characteristics
	String animalName;
	int animalAge;
	String animalType;
	//==========================================
	//NOTE:
	//the default CONSTRUCTOR LOOKS LIKE THIS:
	
//	public Animals() {
//		
//		
//	}
	
	//==========================================
	
	//BUT IN THIS CASE WE WILL ALTER THE CONSTRUCTOR SO IT WILL TAKE IN PARAMETERS
	//AND SET SOME CHARACTERISTICS INSIDE OF IT
	
	//create your OBJECT using this CONSTRUCTOR  using parameters and your variables
	public Animals(String petName, int petAge, String petType ) {
		
		//always a reference to the current object's parent class
		//
		super();
		
		this.animalName = petName;
		this.animalAge = petAge;
		this.animalType = petType;
	}
	
	
	//create a method you wanna do with your variables
	public void animalSpeak() {
		System.out.println("my name is " + animalName);
		System.out.println("i am " + animalAge);
		System.out.println("im proud to be a " + animalType);
	}
	
	public void animalEat() {
		
		System.out.println(animalName + " is eating");
		
	}
	
	public void animalSleep() {
		
		System.out.println(animalName + " is sleeping");
		
	}

}


