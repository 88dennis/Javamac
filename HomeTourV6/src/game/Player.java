package game;

import fixtures.Room;

public class Player extends RoomManager{
//	String currentLocInput;
	Room currentRoom;

	public Player() {
	}
	
	public Player(Room room) {
		this.currentRoom = room;
	}
	
	public Room getCurrentRoom() {	
		return this.currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public String toString() {
		return currentRoom + "";
	}
}
