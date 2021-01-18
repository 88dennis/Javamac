package fixtures;

public class Room extends Fixture {

	private Room[] exits;

	public Room() {

	}

	public Room(String name, String longDescription, String shortDescription ) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.exits = new Room[4];
	}

	public Room[] getExits() {
		return this.exits;
	}

	public Room getExit(String direction) {
		System.out.println("=======FROM ROOM JAVA========");
//		exit = new Room(direction);
		System.out.println(direction);

		switch (direction) {
		case "north":
			System.out.println(this.exits[0].getName());
			System.out.println(this.exits[0].getLongDescription());
			System.out.println(this.exits[0].getShortDescription());
			
			return this.exits[0];
		case "south":
			System.out.println(this.exits[1].getName());
			System.out.println(this.exits[1].getLongDescription());
			System.out.println(this.exits[1].getShortDescription());
			
			return this.exits[1];
		case "east":
			System.out.println(this.exits[2].getName());
			System.out.println(this.exits[2].getLongDescription());
			System.out.println(this.exits[2].getShortDescription());
			
			return this.exits[2];

		case "west":
			System.out.println(this.exits[3].getName());
			System.out.println(this.exits[3].getLongDescription());
			System.out.println(this.exits[3].getShortDescription());
			
			return this.exits[3];
		default:
			return this;
		}
	}
	
	public void setExits(Room north, Room south, Room east, Room west)
	{
		this.exits[0] = north;
		this.exits[1] = south;
		this.exits[2] = east;
		this.exits[3] = west;
	}

	
//	public String toString() {
//		return name + '\n' + '\n' + shortDescription + '\n' + '\n' + longDescription + '\n';
//	}
	
//	public String getName() {
//		return name;
//	}
//	public String getShortDescription() {
//		return shortDescription;
//	}
	
	
}
