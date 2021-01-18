
public class zoo {

	public static void main(String[] args) {
	
		//CREATE AN ANIMAL USING THE CONSTRUCTOR METHOD YOU CREATED IN THE animal.java
		
		Animal animal1 = new Animal("rat", 3, "male", 2);
		Animal animal2 = new Animal("cat", 9, "female", 3);		

		Fish fish1 = new Fish();
		Fish fish2 = new Fish();
		Bird bird1 = new Bird("tweetie");
		Bird bird2 = new Bird("birdie");
		
		animal2.sleep();
		animal1.eat();
		bird2.fly();
		fish1.swim();
		
	}

}
