package java_basics;

public class MyUtils {
	
	//"public static void printAnotherJunk(int anyInt)" THIS LINE IS THE METHOD SIGNATURE with all the keywords and arguements
	//"{System.out.println("Count this " + anyInt);}" THIS IS THE METHOD BODY

	public static void printAnotherJunk(String anyStr) {
		System.out.println("Hello " + anyStr);
	}
	
	public static void printAnotherJunk(int anyInt) {
		System.out.println("Count this " + anyInt);
	}
	
	public static void add2Nums(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
//the method void does not return any value; void methods cannot return a value
	//EXAMPLE OF RETURNING SOMETHING
	//void means it doesnt "RETURN" antything
	
	public static int add10(int thisNum) {
		//when you return something, you are returning a value that you can assign inside a variable
		int result =  10 + thisNum;
		
		return result;
		
	}
	
	//if you remove the STATIC this cannot be accessed directly using MyUtils dot notation
	//this will be already belongs to the instance of this classs
	public int addThis(int oneNum, int twoNum) {
		int ans = oneNum + twoNum;
		
		return ans;
	}
	
}
