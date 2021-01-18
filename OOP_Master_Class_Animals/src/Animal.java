	
public class Animal {

	//set the STATE or initialize the VARIABLES
	String animalType;
	int age;
	String gender;
	int weight;

	//Define the CONSTRUCTOR METHOD based on the variables as parameters or fields
	//right click here then sources, generate constructor using fiels... just a shortcut
	
	public Animal(String animalType, int age, String gender, int weight) {
		super();
		this.animalType = animalType;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	
	//CREATE SOME METHODS or BEHAVIORS
	public void eat() {
		System.out.println(animalType + " is eating ...");

	
	}
	
	public void sleep() {
		System.out.println(animalType + " is sleeping ...");

	
	}

}
