
public class Test {

	public static void main(String[] args) {
		
		Room[] exitsArr;
		Room myHouse = new Room();
		myHouse.getExits();
		System.out.println(myHouse.getExits());
		exitsArr = myHouse.getExits();
		for (int i = 0; i < exitsArr.length; i++) {
			System.out.println(exitsArr[i].getDirection());
		}
	}

	
	
}

