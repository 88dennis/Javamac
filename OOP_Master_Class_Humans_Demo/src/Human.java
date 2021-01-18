public class Human {

	// design of how humans to like in our application

	//STATES OR INSTANCE VARIABLES
	//inititalize
	String name;
	int age;
	int height;
	String eyeColor;
	//RIGHT CLICK THIS AREA, GO TO SOURCE, GENERATE FIELDS
	
	public Human(String firstName, int personAge, int personHeight, String mata) {
		super();
		this.name = firstName;
		this.age = personAge;
		this.height = personHeight;
		this.eyeColor = mata;
	}


	//CONSTRUCTOR METHOD THE DEFAULT LOOKS LIKE THIS
	//should have the same name of your class
	//this is the default constructor method
	//YOU WILL USE THIS METHOD TO CREATE METHOD in earth.javas
//	public Human() {
//		//IF YOU LEAVE THIS BLANK YOU NEED TO SET VALUES IN THE OTHER CLASS AND HARD CODE IT
//	}
	
	//IF YOU DO THIS YOU WILL HAVE THE SAME STATE VALUES TO ALL HUMANS
//	public Human() {
//	name = "tom";
//	eyeColor = "blue";
//	age = 5;
//	height = 70;
//	}	
	
	
	
	//BEHAVIOURS OR METHODS
	public void speak() {
		System.out.println("hello my name is " + name);
		System.out.println("age is " + age);
		System.out.println("height is " + height);
		System.out.println("Eyecolor is " + eyeColor);
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void walk() {
		System.out.println(name + " is walking");
	}
	
	public void work() {
		System.out.println(name + " is working");
	}
	
	

}
