package game;

import java.util.Scanner;

import game.RoomManager;
import game.Player;
import fixtures.Room;

public class Main {

	public static void main(String[] args) {

		RoomManager roommanager1 = new RoomManager();
		roommanager1.init();

		Player player1 = new Player();
		player1.setCurrentRoom(roommanager1.getStartingRoom());
		
		while (true) {
			printRoom(player1);
			String[] commands = collectInput();

			if (commands[0] == "exit") {
				break;
			}
			parse(commands, player1);
		}
	}

	private static void printRoom(Player player) {
		player.getCurrentRoom().getName();
		player.getCurrentRoom().getShortDescription();
		player.getCurrentRoom().getLongDescription();
	}

	private static String[] collectInput() {
		String input;

		String[] arrInput = new String[2];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the game. Please enter two commands:");
		System.out.println("Where do you want to go?");
		// find the next token

		input = scanner.nextLine();

		arrInput = input.split("[\\s.,:]+");

		if (input == "exit") {
			// System.out.println("Exiting");
			arrInput[0] = "exit";
			scanner.close();
			return arrInput;
		}

		while (arrInput.length != 2) {
			System.out.println("Wrong input args: please enter enter two commands");
			System.out.println("Where do you want to go?");
			// find the next token
			input = scanner.nextLine();
			arrInput = input.split("[\\s.,:]+");
		}
		if (input == "exit") {
			scanner.close();
		}

		return arrInput;
	}

	private static void parse(String[] commands, Player player) {
		// commands look like ["go", "north"]
		String direction = commands[1];
		Room currentRoom = player.getCurrentRoom();
		Room targetRoom = currentRoom.getExit(direction);
		player.setCurrentRoom(targetRoom);
	}

}
