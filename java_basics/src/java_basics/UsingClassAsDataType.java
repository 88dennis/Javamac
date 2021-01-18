package java_basics;

public class UsingClassAsDataType {

	public static void main(String[] args) {
		
		//case: you wanna invoke the addThis method here coming form the MyUtils
		//but the problem is the method is not static;
		
		//you cannot invoke the addThis() method because it is not static
		//but you can do this:
		
		//MyUtils.addThis(2, 3); THIS WILL NOT WORK
		
		//TO MAKE IT WORK
		//your CLASS can BE your DATA TYPE:
		//thus you can have classes as datatypes
		
		//declare a variable
		MyUtils myVar;
		
		//assign a value to the variable
		myVar = new MyUtils();
		
		//NOW to invoke the addThis()
		
		System.out.println(myVar.addThis(2, 2));
		
		

	}

}
