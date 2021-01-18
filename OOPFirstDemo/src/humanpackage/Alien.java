package humanpackage;

public class Alien {
	
	String alienName;
	int alienAge;
	int alienHeight;
	String alienEyeColor;
	
	
	//create the ALIEN
	//this statement is used to initialize to CREATE AND OBJECT OR The alien in this case
	//this is the sample of hardcoding the values
//	public Alien() {
//		alienName = "jeff";
//		alienAge = 37;
//		alienHeight = 75;
//		alienEyeColor = "yellow";
//		
//	}


	//to create a DYNAMIC OBJECT set parameters in it
	//this is called creating the FIELDS
	//there is a shortcut in doing this
	//right click, SOURCE, GENERATE CONSTRUCTOR USING FIELDS
	
	public Alien(String pangalan, int edad, int taas, String mata) {
		
		super();
		
		//'this' variable is being used in its class definition; a variable that reference this instance; keyword points to the current object
		this.alienName = pangalan;
		this.alienAge = edad;
		this.alienHeight = taas;
		this.alienEyeColor = mata;
		
	}
	
	public void speakAlien() {
		
		System.out.println("zzzz zzzz aaaa " + alienName);
		System.out.println("zzzz zzzz bbbb " + alienAge);
		System.out.println("zzzz zzzz cccc " + alienHeight);
		System.out.println("zzzz zzzz dddd " + alienEyeColor);
		
	}
	
	
	

}
