package exampleoninheritance;

public class InheritanceExample {
	
	
	//use the class as DATATYPE and the input as variable
	//create a method that takes an arguement
	
	public static void makeItTalk(Animal input) {
		//creating this will have access to speak() and invoke it
		input.speak();
	}
	
	public static void main(String[] args) {

		Animal myAnimal = new Animal();
		
		myAnimal.speak();
		//OR
		makeItTalk(myAnimal);
		
		Dog myDog = new Dog();
		myDog.speak();
		//OR
		makeItTalk(myDog);
		
		
	}
	
}

//class created in this class
class Animal {
	public void speak() {
		System.out.println("Generic animal sound");
	}
}

class Dog extends Animal{
	
//	public void speak() {
//		System.out.println("WOOF sound");
//	}
}
