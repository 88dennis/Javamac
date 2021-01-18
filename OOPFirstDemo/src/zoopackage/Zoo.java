package zoopackage;

public class Zoo {

	public static void main(String[] args) {
		
		//create the variables using the Animals class for your datatype
		//"new Animals()" statement creates the objects// INVOKES the Animals() CONSTRUCTOR in the Animals.java
		//the values inside of it pertains to the parameters in the Animals.java class
		//the dog and cat are just variables so in memory it will allocate the object to be created... its the memory address
		//OBJECTS are a runtime concept; they dont exist when the application runs
		Animals dog = new Animals("taco", 2, "minchin dog");
	
		Animals cat = new Animals("rain", 2, "stray cat");
		
		//invoke the methods you created in the Animals.java using the variables you declared here
		
		dog.animalSpeak();
		cat.animalSpeak();
		
		dog.animalEat();
		
		Fish fish1 = new Fish("nemo");
		
		fish1.fishSwim();
		
		
		//Since you did the EXTENDS, the dog now is the child of the Animal class, and the dog now will have also the common behavior of an animal
		//the Animal class specifications is copied over the Dog class
		//the the dog class can use the methods inside the animal class
		Dog dog1 = new Dog("butter", 2, "shizu");
		
		dog1.animalEat();
		dog1.animalSpeak();
		dog1.bark();
		
		
		run(cat);
		
		//INHERITANCE
		Bird bird1 = new Bird("tweetie", 2, "looney");
		
		//since the bird extends animal class, the bird1 can access all the method in animals
		//it inherits all the functionality of the animal class
		bird1.animalSleep();
		bird1.animalEat();
		
		
		//METHOD OVERRIDING see Chicken.java
		
		Chicken chick1 = new Chicken("roos", 1, "hen");
		chick1.animalSpeak();
		//in here since we entered a new method in Chicken.java, the method was overrided
//		chick1.fly();
		
		Flyable flyingBird = new Eagle("pinoy", 2, "ph eagle");
		
		flyingBird.fly();
		
		
		

	}
	
	//a method inside of the same class should be static
	public static void  run(Animals dog) {
		
		System.out.println("GO " + dog);
	}


}




//YOU CAN ALSO CREATE A CLASS INSIDE OF THIS CLASS OR YOU CAN CREATE A NEW CLASS .java

class Fish {
	
	String fishName;
	
	
	//CONSTRUCTOR
	
	public Fish(String nameOfFish) {
		
		this.fishName = nameOfFish;
		
	}
	
	public void fishSwim() {
		
		System.out.println(fishName + " is a good swimmer");
	}
	
	
	
}


//IMPORTANT NOTE
//THE OBJECT IS ONLY CREATED WHEN YOU RUN THE APPLICATION

