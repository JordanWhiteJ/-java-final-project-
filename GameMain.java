package project1;
import java.util.*;

public class GameMain {
	public static void main(String[]args) {
		System.out.println("Welcome to the Java Game Hub");
		System.out.println("----------------------------");
		int i = 0;
		while(i == 0){
			System.out.println("Please select a game you would like to play");
			System.out.println("1. Guess the Number");
			System.out.println("2. Rock, Paper, Scissors");
			System.out.println("3. Quit");
			Scanner input = new Scanner(System.in);
			System.out.println("Pick a number: ");
			int number = input.nextInt();
			input.nextLine();
			if (number == 1) {
				System.out.println("Guess the Number");
				Game r1 = new GuessTheNumber("Name");
				r1.play();
			}
			else if (number == 2) {
				System.out.println("Rock Papaer Scissors");
				Game r2 = new RockPaperScissor("Name");
				r2.play();
				
			}
			else if (number == 3){
				System.out.println("Quit");
				System.exit(0);
			}
			else {
				System.out.println("Not a valid number");
				System.exit(0);
			}
			
		}
	}
}
