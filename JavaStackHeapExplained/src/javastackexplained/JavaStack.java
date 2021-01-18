package javastackexplained;

public class JavaStack {
	
	//in java code needs to be wrapped in named blocks called methods
	//methods do all the work in java application

	//when you hit the run button
	//memory areas are STACK and HEAP inside your RAM

	//STACK memory area
	//it creates a frame

	
	public static void main(String[] args) {
		int age;
		age = 12;

		doWork(age);

//		doThis.doWork();
		
		//the CAR is not a primitive datatype; its a complex datatype; its a class
		// this variable will be inside the STACK memory
		//this will point to the object that you will create
		Car myCar;
		
		//the myCar is not a regular variable; it does not contain the object
		//the myCar is a REFERENCE VARIABLE it refers to the where the actual object resides in memory area the HEAP
		//the myCar variable will the assigned with the memory address in the HEAP
		//here we are creating the memory address to "Car()" in the HEAP memory
		myCar = new Car();
		
		
		//if you declare a same variable twice with the same constructor it will create a new address in the memory;
		//myCar will now point to a new address leaving the old one alone/ rogue;
		//every so often there will be a GARBAGE COLLECTION to remove the reference variables that has no relation anymore
		//to free space in the memory
		myCar = new Car();
		
		
		myCar.sayCarName();
		
		
		//then lets create an INSTANCE named Car
		//when you do this a space in the HEAP will be created
		
		//the my2car will be inside of the STACK pointing to the new Car() in the HEAP
		Car my2Car = new Car();
		my2Car.hp = 120;
		
		
		//when you do this a another space in the HEAP will be created
		Car my3Car = new Car();
		
		my3Car.hp = 1000;
		
		Engine bigEngine = new Engine();
		
		my3Car.myEngine = bigEngine;
		
		
	}
	
	public static void doWork(int num) {
		
		System.out.println("do this work " + num);
		
	}

}

//class Work {
//	
//	float weight;
//	
//	public Work(int bigat) {
//		this.weight = bigat;
//		
//	}
//	
//	public void doWork() {
//		
//		System.out.println("do this work " + weight);
//		
//	}
//	
//	
//}

class Car {
	
	//create an INSTANCE VARIABLE -PRIMITIVE INSTANCE VARIABLE
	//this instance variable maintains the state or slot in the HEAP for hp;
	int hp;
	
	//the default CONSTRUCTOR WILL BE LIKE THIS
	//you will edit this default if you want to put some fields inside of it
	//see ANIMALS.JAVA
	//this default CONSTRUCTOR will be invoked inside your main method when you do the "Car myCar = Car();"
	//but if your not gonna pass anything inside of it you can just not type it in here; its invisible and default 
	
	public Car() {
		
		
	}
	//create an INSTANCE VARIABLE that is COMPLEX

	Engine myEngine;
	
	
	
	public void sayCarName() {
		
		System.out.println("this is my Car");
		
	}
}

class Engine {
	
	
	
}