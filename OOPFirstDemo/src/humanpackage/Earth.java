package humanpackage;

public class Earth {
	
	public static void main(String[] args) {
		
		//USE THE CLASS HUMAN AS THE DATATYPE TO DECLARE A VARIABLE
		//declaring a variable using the class Human from Human.java to declare a variable
		//"tom" is an INSTANCE VARIABLE; it points to the ACTUAL OBJECT or the ACTUAL INSTANCE
		//other people call it the OBJECT VARIABLE
		//this statement does not create the object yet
		Human tom;

		//this new keyword is used to create a CONSTRUCTOR OBJECT
		//keep this syntax in mind
		//when this statement runs, this CREATES the OBJECT
		tom = new Human();
		
		//when you call tom here the values of your characteristics will be 0 and null
		//because you did not assign any value to tom
		
		tom.speak();
		
		//after creating your constructor object
		//assign value to tom
		
		//YOU CAN DO THIS IN THE human.java
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tomas Mapua";
		
		//here when we invoke it, it the values will be shown
		tom.speak();
		
		tom.eat();
		
		tom.sleep();
		
		//create another variable
		Human joe;
		
		//assign the object
		joe = new Human();
		
		
		joe.age = 6;
		joe.eyeColor = "blue"; 
		joe.heightInInches = 73;
		joe.name = "joe kups";
		
		joe.speak();
		
	}

}
