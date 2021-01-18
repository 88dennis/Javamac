package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	private static Player updateRoom;
	private static String[] arrInput = new String[2];
	private static String locInput;
	private static boolean goTour = true;
	private static Room getDirection;
	private static Player currentRoom;
	private static RoomManager initializeRooms;

	public static void main(String[] args) {
		initializeRooms = new RoomManager();
		initializeRooms.init();

		RoomManager show = new RoomManager();
		show.printStartingRoom();

		collectInput();
//		Room roomCurrent = new Room();

//		

//		System.out.println(otherCommandsArr.length);

//		roomExitsArr = room1.initializeExits();

//	System.out.println(show.getStartingRoom().getShortDescription());

//		while (goTour == true) {
//			collectInput();
//			parse(arrInput, currentRoom);
//		}

	}

	private static void printRoom(Player player) {

		System.out.println(player);
	}

	private static String[] collectInput() {
		String input;
		boolean checker = true;
		String message;
		arrInput = new String[2];
		Scanner scanner = new Scanner(System.in);

//		if(arrInput.length > 2) {
//			System.out.println("enter one or two commands only");
//		}
////		while(arrInput.length > 2) {
////			System.out.println("enter one or two commands only");
////			break;
////		}
//		while(checker == true) {
//			System.out.println("where do you want to go?");
//			input = scanner.nextLine();
//			arrInput = input.split("[\\s.,:]+");
//			
//			}

		do {
			// REPEAT THIS WHILE INPUT IS INVALID

			while (arrInput.length > 2) {
				System.out.println("enter two commands");
				System.out.println("where do you want to go?");
				// find the next token
				scanner.next();
			}
			System.out.println("where do you want to go?");
			input = scanner.nextLine();
			arrInput = input.split("[\\s.,:]+");
			parse(arrInput, updateRoom);
			checker = false;
		} while (checker == true);
		// just to control the leak of the scanner

//		do {
//			if (goTour == true) {
//				System.out.println("where do you want to go?");
//			}
//			input = scanner.nextLine();
//
//			if (input.equals("leave")) {
//				goTour = false;
//				message = "bye";
//				checker = true;
//				goTour = false;
//				System.out.println(message);
//			}
//
//			if (input.equals("go")) {
//				System.out.println("go where?");
//				input = scanner.nextLine();
//			}
//
////			for (int i = 0; i < otherCommandsArr.length; i++) {
////				if (otherCommandsArr[i].equals(input)) {
////
////					if (otherCommandsArr[i].equals("east") || otherCommandsArr[i].equals("living")) {
////						System.out.println("ASHDOHSDOIASDOIADSOIDSJODSJODOSDAI");
////						System.out.println(otherCommandsArr[i]);
////					
////						arrInput[0] = "go";
////						arrInput[1] = "east";
////						
////						parse(arrInput, currentRoom);
//////					
//////						
//////						otherCommandsArr = show.setCommandsStrArr(show.getLivingRoom());
//////						
//////						for (int j = 0; j < otherCommandsArr.length; j++) {
//////							System.out.println(otherCommandsArr[i]);
//////						}
//////						System.out.println(otherCommandsArr.length);
////					}
////
////					if (otherCommandsArr[i] == "west") {
////						System.out.println(otherCommandsArr[i]);
////						System.out.println(otherCommandsArr[i]);
////					}
////				}
////			}
//
////			for (int i = 0; i < otherCommandsArr.length; i++) {
////				if (input.equals("go " + otherCommandsArr[i])) {
////					checker = true;
//////					message = "";
////					arrInput[0] = "go";
////					arrInput[1] = otherCommandsArr[i];
//////					System.out.println(message);
////					break;
////				}
////
////				if (input.equals(otherCommandsArr[i])) {
////					if ((roomExitsArr[i].getDirection()).equals("leave")) {
////						goTour = false;
////						checker = false;
////						message = "bye";
////						System.out.println(message);
////					} else {
////						checker = true;
////						message = "Nice";
////						arrInput[0] = "go";
////						arrInput[1] = otherCommandsArr[i];
////						System.out.println(message);
////						break;
////					}
////				}
////			}
//
//		} while (!checker == true);
//

//
//		for (int i = 0; i < arrInput.length; i++) {
//			//==============ARRINPUT====
//			System.out.println(arrInput[i]);
//		}
//
		if (input.equals("close")) {
			scanner.close();
		}

		return arrInput;
	}

	private static void parse(String[] command, Player player) {
		RoomManager goToRoom = new RoomManager();
		String[] otherCommandsArr;
		
		otherCommandsArr = goToRoom.setCommandsStrArr(goToRoom.getStartingRoom());

		for (int i = 0; i < otherCommandsArr.length; i++) {
			System.out.println(otherCommandsArr[i]);
		}

		Player getPlayerToLivingRoom;
		getPlayerToLivingRoom = new Player();
		getPlayerToLivingRoom.setCurrentRoom(initializeRooms.getLivingRoom());
		getPlayerToLivingRoom.getCurrentRoom();
		updateRoom = getPlayerToLivingRoom;
		otherCommandsArr = updateRoom.getCurrentRoom().getShortDescription().split("[\\s.,:]+");
		printRoom(updateRoom);
		for (int i = 0; i < otherCommandsArr.length; i++) {
			System.out.println(otherCommandsArr[i]);
		}
		
		
//		System.out.println(player);
//		String[] 
//
//		System.out.println("=================");
//		System.out.println(commandArr.length);
//		for (int i = 0; i < command.length; i++) {
//			System.out.println(command[i]);
//		}
//		System.out.println("=================");

		collectInput();

	}
}

//private static void parse(String[] command, Player player) {
//	printRoom(player);
//	locInput = command[1];
//	Player currentloc = new Player();
//	getDirection = new Room();
////	for (int i = 0; i < command.length; i++) {
////		System.out.println(command[i]);
////	}
//	String[] casesArr = {"north", "east", "west", "south"};
//	for(int i = 0; i < casesArr.length; i++) {
//		if(casesArr[i] == command[1]){
//			locInput = command[1];
//		}
//	}
//	
//	switch (locInput) {
//	case "north":
//		getDirection.getExit(locInput);
//		getDirection.getExits();
//		currentloc.getCurrentRoom();
//		currentRoom = currentloc;
//		collectInput();
//		parse(arrInput, currentRoom);
//		break;
//	case "east":
//		getDirection.getExit(locInput);
//		getDirection.getExits();
//		currentloc.getCurrentRoom();
//		currentRoom = currentloc;
//		collectInput();
//		parse(arrInput, currentRoom);
//		break;
//		
//	case "west":
//		getDirection.getExit(locInput);
//		getDirection.getExits();
//		currentloc.getCurrentRoom();
//		currentRoom = currentloc;
//		collectInput();
//		parse(arrInput, currentRoom);
//		break;
//		
//	case "back":
//		getDirection.getExit(locInput);
//		getDirection.getExits();
//		currentloc.getCurrentRoom();
//		currentRoom = currentloc;
//		collectInput();
//		parse(arrInput, currentRoom);
//		break;
//	}
//	
//}
