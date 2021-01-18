package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array variables - store a collection of elements with the same type
		//integer array
		//declaring a variable of datatype "integer array" and allows us to store multiple elements
		//"new int[]" is initializing an array to store a 100 elements
		//this is a fixed size
		// this can only store integers
		
		int [] values = new int[100];
		
		//specify a position/ slot
		//think of it as a slot address
		//0 to 99 slots or index position
		
		values[0] = 1000;
		values[99] = 93432;
		
		
		String [] words = new String[100];
		
		String [] myWords = new String[] {"my", "name", "is"};
		
		words[0] = "hello";
 		
		//this should show you by default number 0
		System.out.println(values[1]);
		
		System.out.println(words.length);
		
		System.out.println(words[0]);
		
		System.out.println(myWords[2]);
		
		System.out.println(myWords.length);
		
		myWords = new String[10];
		
		//if you assign an new array the data will be gone
		//the length will be changed
		System.out.println(myWords.length);
		
		System.out.println(myWords[2]);
		
		
	}
}
