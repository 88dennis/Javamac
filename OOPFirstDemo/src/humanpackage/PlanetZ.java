package humanpackage;

public class PlanetZ {

	public static void main(String[] args) {
		
	//use the class to declare a variable
	//if we print this they will have the SAME VALUES
	//BUT they are completely DIFFERENT OBJECTS
//	Alien zerg1 = new Alien();
//	Alien zerg2 = new Alien();
//	Alien zerg3 = new Alien();
//	
//	zerg1.speakAlien();
//	zerg2.speakAlien();	
//	zerg3.speakAlien();
	
		
		//USING THE DYNAMIC OBJECT
	Alien zerg1 = new Alien("jeff", 39, 78, "yellow");
	Alien zerg2 = new Alien("den", 39, 88, "green");

	zerg1.speakAlien();
	zerg2.speakAlien();	
	
	}
	
	
}
