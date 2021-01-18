package zoopackage;


//EXAMPLE OF INHERITANCE
//the Animal class is the Parent Class and the Dog is the child class
//the Animals here is the SUPER CLASS OR THE BASE CLASS
//the Dog here is the SUBCLASS


public class Dog extends Animals {
	
	//when you add EXTENDS now the Dog is now the child of the Animal Class
	//you just copy the constructor you made from the animals and add the SUPER method
	//OR you right click on Dog and click add constructor; eclipse will auto do it for you
	
	public Dog(String petName, int petAge, String petType) {
		//its calling the super
		super(petName, petAge, petType);
	
	}

	//if you do the EXTENDS you would have to DEFINE a CONSTRUCTOR
	//the default constructor wont work anymore
	//we need to create a similar constructor same as animals
	
	
	public void bark() {
		System.out.println("WOOF WOOF");
	}

}
