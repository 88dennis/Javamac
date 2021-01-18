package practice.strings;

public class StringPractice {
	
	//substring(twoArgs) = same with splice; EXTRACTS the stirngs you want to extract
	//equals(arg) = for comparison
	//length(noArg) = number of elements
	//charAt(arg) = returns a character
	//indexOf(String s, int)
	//lastIndexOf = reference from the right
	
	public static void main(String[] args) {
		
		
		String a = "hello  !@#$%^&*() ";
		
		String str = "ABCDEFG";
		
		String extractedString = str.substring(2);
		
		//extract index 2 to index 4 but not including index 4
		//its like splice
		String extractedString2 = str.substring(2, 4);
		
		
		//spaces also qualifies as characters
		
		System.out.println(a.length());
		
		System.out.println(str.length());
		
		System.out.println(extractedString);
		
		System.out.println(extractedString2);
		
		
		String strA = "hello";
		
		String strB = "there";
		
		String strC = "hello";
		
		String strD =  "hello there category:a";
		
		//for strings do NOT do this:
		
		if(strA == "hello") {
			
			//do some code
		}
		
		//you should use the .equals() METHOD
		//string is actually an OBJECT or backed by a CLASS
		//its not like integers
		//so when comparing strings you should use the equals() METHOD
		
		if(strA.equals(strC)) {
			
			System.out.println("THEY ARE THE SAME");
			
		}
		
		//if you wanna ignore the lower or uppercase
		if(strB.equalsIgnoreCase("There")) {
			
			System.out.println("THEY ARE THE SAME");
			
		}
		
		
		//charAt
		System.out.println(strA.charAt(4));
		
		//indexOf
		System.out.println(strD.indexOf("category") +9);
		//starts at index position 12
		
		// you can put another arguement to indicate where you wanna start the counting
		
		System.out.println(strD.indexOf("ogag", 6) + " OGAG2");
		//starts at index position 12
				
	}
	
	
	

}
