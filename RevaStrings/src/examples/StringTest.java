package examples;

public class StringTest {

	//to create a new object
	public static void main(String[] args) {
		String stringA = "Hello";
//		String stringB = "Hello";
		
		
//this shows that this newly created object is not equal to the stringA
		//doest not point to the same object
		
		//this is a constructor
		//they have the same value but not the same object
		String stringB = new String("Hello");
		
		System.out.println("String A " + stringA);
		System.out.println("String B " + stringB);
		
		
		if(stringA == stringB) {
			System.out.println("Point to the same object");
		
		} else {
			System.out.println("String A & B do NOT point to the same object");
		}

		
		String string1 = "hello";
		String string2 = new String("Hello");
		
		System.out.println(string1.length());
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());
		System.out.println(string1.indexOf("e"));
		System.out.println(string1.lastIndexOf("h"));
		System.out.println(string1.charAt(4));
		System.out.println(string1.equals(string2));
		System.out.println(string1.equalsIgnoreCase(string2));
		
	}

}
