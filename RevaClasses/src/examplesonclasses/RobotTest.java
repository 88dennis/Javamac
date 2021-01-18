package examplesonclasses;

public class RobotTest {

	public static void main(String[] args) {
		
		//"Robot" is the DATATYPE and "myRobot" is the variable
		//this creates the new robot
		
		//it tells the JVM to create a new instance of robot
		//and calls the constructor method to initialize the object
		//constructor is used to create an object and set its state
		//the Robot() calls the CONSTRUCTOR inside the Robot.java
		
		Robot myRobot = new Robot(-1);
		
		myRobot.travel();
		
		myRobot.setMaxSpeed(4);
		

	}

}
