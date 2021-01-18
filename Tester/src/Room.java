import game.RoomManager;

public class Room {
Room[] exits;
	String direction;

Room () {
}
Room (String direction) {
	this.direction = direction;
}
	Room[] getExits() {
		

		
		Room north = new Room("north");
		Room east = new Room("east");
		Room west = new Room("west");
		Room south = new Room("south");
		
		exits = new Room[4];
		exits[0] = north;
		exits[1] = east;
		exits[2] = west;
		exits[3] = south;
		return exits;
	}
	
	public String getDirection() {
		return direction;
	}
	
//	public String toString() {
//		return direction;
//	}
}
