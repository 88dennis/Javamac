package java_basics;

//you need this import code to import class and a method from other packages
import someotherpackage.ExampleOutsideClass;

public class LearningMethods {

	//The public static void main is the entry point of every java program
	//the program wont run without this code
	//the "public" is the access modifier
	//the "private" keyword should be used locally the other class/ .java wont be able to access it
	// the "private method will not be visible for other class or .java
	//public is visible for other classes even if the classes are inside another package
	// but you need to import the class...
	
	//if you do not declare public nor private just a no class.. other packages wont see the class
	//"String[]" is a data type string
	//main is the name of the method
	//static is what you reference when invoking a method
	
	public static void main(String[] args) {
		
		//main method
		
		//this is invoking a method printline or println
		//we are giving the method a data or an arguement
		//this is just printing on the screen
		//this is a predefined method
		//the "System" is a class; the "out" is a variable;
		
		System.out.println("hello");
		
		//we invoked our own created methods outside the main method
		printSomeJunk("carissa hahaha");
		
		printSomeJunk(888);
		
		//we invoked this from the file or class "MyUtils"
		//all the code/ method is inside that class or file
		//see MyUtils.java
		MyUtils.printAnotherJunk("carissa");
		MyUtils.printAnotherJunk(99999);
		MyUtils.add2Nums(5, 6);
		int myNum = MyUtils.add10(99);
		System.out.println(myNum);
		
		//from "someotherpackage"
		ExampleOutsideClass.sayThis();
		
		//WITHOUT THE STATIC
		//accessing the method addThis() in the MyUtils
		//this method has no keyword STATIC anymore...
		//the only way to access this is by instanciating it
		MyUtils myAdd = new MyUtils();
		
		int addResult = myAdd.addThis(25, 25);
		
		System.out.println(addResult);

	}

	
	//HOW TO DEFINE A METHOD
	//this method is accepting an arguement of type string
	//the "anyName' can be any name
	//you can define a CLASS WITH A METHOD INSIDE OF IT SO YOU CAN USE IT IN HERE
	//I will create a class named "MyUtils"
	
	public static void printSomeJunk(String anyName) {
		System.out.println("Blah Blah Blah " + anyName);
	}
	
	//this is another version even it has the same name
	
	public static void printSomeJunk(int anyNum) {
		System.out.println("Blah Blah Blah " + anyNum);
	}
	
	
	
	
	
}
