package examples;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int[] firstArray = new int[3];
		
		int[] secondArray = {1, 2, 3};
		
		firstArray[0] = 2;
		firstArray[1] = 4;
		firstArray[2] = 6;
		
		System.out.println(firstArray[1]);
		System.out.println(secondArray.length);
		System.out.println(secondArray[0]);
		
		
	}

}
