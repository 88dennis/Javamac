package zoopackage;

public class Chicken extends Bird{

	public Chicken(String petName, int petAge, String petType) {
		super(petName, petAge, petType);
		// TODO Auto-generated constructor stub
	}
	
	//the chicken doesn't fly
	//you may override it by creating the same method name in here
	//redefining the method fly()
	
	
//	public void fly() {
//		System.out.println("not able to fly");
//	}

	
	//you may also use an INTERFACE CLASS inside the PARENT CLASS which is Flyable.java
	//we already removed the behavior/ method fly() inside Bird.java since we created the Flyable.java
	//we also commented out the fly() method here since we are going to use the Flyable.java
	//the only one that will use the Flyable method is the Eagle.java
	
	
}
