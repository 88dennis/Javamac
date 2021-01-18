package game;

import fixtures.Room;

public class RoomManager {


	private Room startingRoom;
	private Room[] rooms;

	public RoomManager() {

	}

	public void init() {

		this.rooms = new Room[5];
		Room hallway = new Room("Starting Room", "Starting Room Short desc", "n e s w");
		this.rooms[0] = hallway;
	
		Room dining = new Room("Dining Room", "Dining Room short desc", "long dining left right up down");
		this.rooms[1] = dining;
		
		Room living = new Room("living Room", "living Room short desc", "long living there here further near");
		this.rooms[2] = living;
	
		Room bathroom = new Room("bath Room", "bath Room short desc", "long bath description there here further near");
		this.rooms[3] = bathroom;
		
		this.startingRoom = hallway;
		
		hallway.setExits(bathroom, hallway, living, dining);
		dining.setExits(dining, living, bathroom, hallway);
		living.setExits(living, dining, hallway, bathroom);
		bathroom.setExits(bathroom, hallway, living, dining);
		
		System.out.println(hallway.getName());
		System.out.println(hallway.getLongDescription());
		System.out.println(hallway.getShortDescription());
			
		
//		System.out.println(dining.getName());
//		System.out.println(dining.getShortDescription());
//		System.out.println(dining.getLongDescription());
	}

	public Room getStartingRoom() {
		return startingRoom;
	}

}
