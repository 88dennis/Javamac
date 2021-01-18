package zoopackage;

public class Bird extends Animals {
	//EXAMPLE OF INHERITANCE
	//INHERITANCE - One class inherits behavior from another class
	//the Animal class is the Parent Class and the Bird is the child class
	//the Animals here is the SUPER CLASS OR THE BASE CLASS
	//the Dog here is the SUBCLASS


	//when you add EXTENDS now the Dog is now the child of the Animal Class
		//you just copy the constructor you made from the animals and add the SUPER method
		//OR you right click on Dog and click add constructor; eclipse will auto do it for you
	//when we EXTEND the DEFAULT CONSTRUCTOR will NOT work anymore
	
public Bird(String petName, int petAge, String petType ) {
		super(petName, petAge, petType);
	}


//INTERFACE
//SINCE NOT ALL BIRDS FLY YOU MAY REMOVE THIS AND JUST CREATE AN INTERFACE
//public void fly() {
//	
//	System.out.println("fly bird....");
//	
//	
//}





}
