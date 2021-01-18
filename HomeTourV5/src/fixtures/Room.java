package fixtures;

public class Room extends Fixture {
	private Room exit;
	private Room[] exits;
	private String direction;
	

	public Room() {

	}

	public Room(String direction) {
		this.direction = direction;
	}

	public Room(String name, String longDescription, String shortDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	@Override
	public Room getExit(String direction) {
		setDirection(direction);
		getDirection();
		System.out.println("=======FROM ROOM JAVA========");
		exit = new Room(direction);
		return exit;
	}

	
	@Override
	public Room[] getExits() {
		
		
		
		
		return exits;
	}
	public String toString() {
		return name + '\n' + '\n' + shortDescription + '\n' + '\n' + longDescription + '\n';
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
