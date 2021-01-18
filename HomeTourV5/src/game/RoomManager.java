package game;

import fixtures.Room;

public class RoomManager extends Room {

	String name;
	String shortDescription;
	String longDescription;
	Room roomCurrent;
Player playerCurrentRoom;
	private Room startingRoom;
	private Room livingRoom;
	private Room room3;
	private Room room4;
	private Room[] rooms;
	String[] commandsStrArr;

	public RoomManager() {

	}

	public RoomManager(String name, String longDescription, String shortDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	
	}

	public void init() {
		
		getStartingRoom();
		getLivingRoom();
		getRoom3();
		getRoom4();
		getRooms();
//		System.out.println(rooms.length);
//		for( int i = 0; i < rooms.length; i++) {
//			System.out.println(rooms[i].getName());
//		}
//		getRooms();
	}

//	public String printRoom() {
//		return name + '\n' + shortDescription + '\n' + longDescription;
//	}
	public Room getStartingRoom() {
		setStartingRoom(new Room("A Simple House",
				"A bungalo house with a four-car garage and a lawn. With to old main doors west leads to the dining area east to the main living room.",
				"west: dining area " + '\n' + "east: living area" ));
		
		playerCurrentRoom = new Player();
		playerCurrentRoom.setCurrentRoom(startingRoom);
		playerCurrentRoom.getCurrentRoom();
		
		setCommandsStrArr(startingRoom);
		getCommandsStrArr();
		
		return startingRoom;
	}

	public void setStartingRoom(Room roomStart) {
		this.startingRoom = roomStart;
	}

	public Room getLivingRoom() {
		setLivingRoom(new Room("Living Room",
				"As you enter the door, on the right of you is a large window and on the left is an old book shelf. On your left also, you'll see a door far back a hallway. If you go straight past the living room, there's a small door.  also you'll see",
				"left: walk the hallway" + '\n' + "straight: small door"));
		
		playerCurrentRoom = new Player();
		playerCurrentRoom.setCurrentRoom(livingRoom);
		playerCurrentRoom.getCurrentRoom();
		setCommandsStrArr(livingRoom);
		getCommandsStrArr();
		
		return livingRoom;
	}
	
	public void printLivingRoom() {
		getLivingRoom();
		System.out.println(livingRoom.getName());
		System.out.println(livingRoom.getLongDescription());
		System.out.println(livingRoom.getShortDescription());
		
	}
	
	public void printStartingRoom() {
		getStartingRoom();
		System.out.println(startingRoom.getName());
		System.out.println(startingRoom.getLongDescription());
		System.out.println(startingRoom.getShortDescription());
		
	}


	public void setLivingRoom(Room livingRoom) {
		
		this.livingRoom = livingRoom;
	}

	public Room getRoom3() {
		setRoom3(new Room("the room3", "third room in the house", "the longest description third room"));
		setCommandsStrArr(room3);
		getCommandsStrArr();
	
		
		return room3;
	}

	public void setRoom3(Room room3) {
		this.room3 = room3;
	}

	public Room getRoom4() {
		setRoom4(new Room("exit", "exit room in the house", "the longest description exit room"));
		setCommandsStrArr(room4);
		getCommandsStrArr();
		
	
		return room4;
	}

	public void setRoom4(Room room4) {
		this.room4 = room4;
	}

	public Room[] getRooms() {
		rooms = new Room[4];
		rooms[0] = startingRoom;
		rooms[1] = livingRoom;
		rooms[2] = room3;
		rooms[3] = room4;
		return rooms;
	}

	public String getName() {
		return name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public Room getRoomCurrent() {
		return roomCurrent;
	}
	public void setCurrentRoom(Room roomCurrent) {
			this.roomCurrent = roomCurrent;
	}
	
public String[] setCommandsStrArr(Room roomCurrent) {
	this.commandsStrArr = roomCurrent.getShortDescription().split("[\\s.,:]+");
	return commandsStrArr;
		
	}


public String[] getCommandsStrArr() {
	return commandsStrArr;
}



	public String toString() {

		return rooms + " list ";

	}

}
