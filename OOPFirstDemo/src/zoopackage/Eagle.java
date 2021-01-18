package zoopackage;

public class Eagle extends Bird implements Flyable{

	public Eagle(String petName, int petAge, String petType) {
		super(petName, petAge, petType);
		
	}

	//if we implement Flyable, the chicken wont have an access to fly() method anymore
	//see zoo.java
	public void fly() {
		System.out.println("The Eagle is flying high");
		
	}
	
	

}
