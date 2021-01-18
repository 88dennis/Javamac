package examplesonclasses;

public class Robot {
	
	private int maxSpeed;
	
	//this is the CONSTRUCTOR to set the values of maxSpeed
	public Robot(int setMax) {
		this.maxSpeed = setMax;
	}
	
	//return the variable maxSpeed so its variable can be used
	
	//this is the GETTER METHOD
	public int getMaxSpeed() {
		return maxSpeed;
		
	}
	
	
	//This is the SETTER METHOD conditions for the maxSpeed
	//method is void because you dont need to return anything
	public void setMaxSpeed(int maxSpeed) {
		
		if(maxSpeed >= 0) {
			this.maxSpeed = maxSpeed;
			
		} else {
			this.maxSpeed = 0;
		}
	}
	
	//method is void; this will just print something
	public void travel() {
		System.out.println("the maxSpeed is " + maxSpeed );
	}

}
