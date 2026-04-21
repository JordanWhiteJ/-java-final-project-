package project1;
import java.io.*;
import java.util.*;

public class RockPaperScissor extends Game {
	//Constructors
	public RockPaperScissor(String name) {
		super(name);
		}
			
	//Getters
	public String getName() {
		return name;
	}

		
	//instance methods
	public void start() {
			
	}
		
	public void play() {
		int cont = 0;
		while (cont == 0) {
			String[] choices = {"Rock", "Paper", "Scissors"};
			Random r = new Random();
			Scanner input = new Scanner(System.in);
			System.out.println("Is this your last time playing? (Yes or No): ");
			String playing = input.nextLine();
			input.nextLine();
			if (playing.equalsIgnoreCase("Yes")) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No or invalid input");
				cont = 1;
			}
			System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
			String userChoice = input.nextLine();
			input.nextLine();
			int compIndex = r.nextInt(3);
			String compChoice = choices[compIndex];
			System.out.println("Computer chose: " + compChoice);
			if(userChoice.equalsIgnoreCase(compChoice)) {
				System.out.println("It's a draw!");
			}
			else if ((userChoice.equalsIgnoreCase("Rock") && compChoice.equals("Scissors")) || (userChoice.equalsIgnoreCase("Paper") && compChoice.equals("Rock")) || (userChoice.equalsIgnoreCase("Scissors") && compChoice.equals("Paper"))) {
				System.out.println("You win!");
			}
			else {
				System.out.println("You lose!");
			}	
		}
	}
	
	public void end() {
			
	}

}
