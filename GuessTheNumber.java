package project1;
import java.io.*;
import java.util.*;


public class GuessTheNumber extends Game {
	//Constructors
	public GuessTheNumber(String name) {
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
		int guess = 0;
		int count = 0;
		Random rand = new Random();
		int randomNum = rand.nextInt(101);
		//System.out.println("Random Number: " + randomNum); Checking what the number is
	    while(guess != randomNum) {
	    	Scanner input = new Scanner(System.in);
			input.nextLine();
			System.out.println("Enter you guess (0 - 100): ");
			int number = input.nextInt();
			input.nextLine();
	    	if(number < randomNum) {
	    		System.out.println("Too Low! Try again.");
	    		count = count + 1;
	    	}
	    	else if(number > randomNum) {
	    		System.out.println("Too High! Try again.");
	    		count = count + 1;
	    	}
	    	else {
	    		System.out.println("You guess the right number!");
	    		System.out.println("Number of tries:" + count);
				guess = 1;
	    	}
	    		
	    }	
	}
	
	public void end() {
			
	}

}
