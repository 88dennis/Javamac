package practice.loops;

public class LoopsHW {
	
	//using WHILE LOOPS
	//INDEXOF METHODS
	//SUBSTRING METHODS
	
	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apparel and the slightly "
				+ "more in demand category:makeup along with the category:furniture and ... .";
		
		printCategories(str);
	}

	
	//extract all categories from the string arguement
	
	public static void printCategories(String string) {
		
		//index incrementor
		int i = 0;
		
		System.out.println(string.length());
		
		while(i <= string.length()) {
			
			//store the indexOf string to a variable
			int found = string.indexOf("category:", i);
			
			System.out.println(found + " = FOUND");
			
			//the -1 means we cannot find category: anymore
			if(found == -1)break;
		
			int start = found +9;// start of the actual category
			
			int end = string.indexOf(" ", start);
			
			System.out.println(string.substring(start, end));
			
			System.out.println(start + " = START");
			System.out.println(end + " = END");
			
			
			i = end + 1;
			//you added 1 because on substring
			
		}
		
	}
}
