package game;

import fixtures.Room;

public class Player extends RoomManager{
//	String currentLocInput;
	Room currentRoom;

	public Player() {
		
		getCurrentRoom();
	}

	public Room getCurrentRoom() {

		
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		
			this.currentRoom = currentRoom;
	}

	public String toString() {
		return currentRoom + "";
	}
}
