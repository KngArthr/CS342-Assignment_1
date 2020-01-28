package cs342_AssignmentOne;

import java.util.Random;

public class Console {
	Random rand = new Random();
	private int generatedNumber;
	
	public Console() {
		this.generatedNumber = rand.nextInt(1001);
	}
	
	public void initialPrompt() {
		System.out.println("Welcome to the game!");
		System.out.println("I am thinking of integer between 1 and 1000. Guess it: ");

	}
	public void highGuessPrompt(int input) {
		System.out.println(input + " is too high.");
		System.out.println("Please guess another integer between 1 and 1000: ");

	}
	public void lowGuessPrompt(int input) {
		System.out.println(input + " is too low.");
		System.out.println("Please guess another integer between 1 and 1000: ");

	}
	public void correctGuessPrompt(int turnsUsed) {
		System.out.println("Congratulations! The correct integer is " + generatedNumber);
		System.out.println(turnsUsed + " turns were used");

	}
	public void incorrectFormatPrompt() {
		System.out.println("Incorrect Format Input. Please enter an integer between 1 and 1000");

	}
	
	public boolean isCorrectFormat(String input) {
		String regex = "[0-9]+";
		if(input.matches(regex)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isNotEmpty(String input) {
		if(input.isBlank()) {
			return false;
		}else {
			return true;
		}
	}
	public int getGeneratedNumber() {
		return generatedNumber;
	}
	public void setGeneratedNumber(int number) {
		this.generatedNumber = number;
	}
}
