//
// Class:  Console
//
// Description:
// This is the console class where physical "console" object resides.
// The console generates a random number between 1 and 1000.
// The console also contains all the prompts and filtering
// methods that are required.
//


package cs342_AssignmentOne;

import java.util.Random;

public class Console {
	Random rand = new Random();
	private int generatedNumber;
	
	
///////////////////////////////////////////////////////////////////
/// Console
/// Input : None
/// Output: None
/// Constructor for Console class. Generates and stores a 
/// random number between 1 and 1000.
///////////////////////////////////////////////////////////////////
	public Console() {
		this.generatedNumber = rand.nextInt(1001);
	}
	
///////////////////////////////////////////////////////////////////
/// initalPrompt
/// Input : None
/// Output: text in the console
/// Generates initial prompt in the console.
///////////////////////////////////////////////////////////////////
	
	public void initialPrompt() {
		System.out.println("Welcome to the game!");
		System.out.println("I am thinking of integer between 1 and 1000. Guess it: ");

	}
	
///////////////////////////////////////////////////////////////////
/// highGuessPrompt
/// Input : integer input
/// Generates a prompt in the console for when the user guesses
///	a number about the generated number. Prompt includes the
/// user's guess.
/// 
///////////////////////////////////////////////////////////////////
	
	public void highGuessPrompt(int input) {
		System.out.println(input + " is too high.");
		System.out.println("Please guess another integer between 1 and 1000: ");

	}

///////////////////////////////////////////////////////////////////
/// lowGuessPrompt
/// Input : integer input
/// Output: text in the console
/// Generates a prompt in the console for when the user guesses
///	a number below the generated number. Prompt includes the
/// user's guess.
/// 
///////////////////////////////////////////////////////////////////
	
	public void lowGuessPrompt(int input) {
		System.out.println(input + " is too low.");
		System.out.println("Please guess another integer between 1 and 1000: ");

	}
	
///////////////////////////////////////////////////////////////////
/// correctGuessPrompt
/// Input : None
/// Output: text in the console
/// Generates a prompt in the console for when the user guesses
///	the correct generated number. Prompt includes the mystery number
/// and the amount of turns the user took to guess it.
/// 
///////////////////////////////////////////////////////////////////
	
	public void correctGuessPrompt(int turnsUsed) {
		System.out.println("Congratulations! The correct integer is " + generatedNumber);
		System.out.println(turnsUsed + " turns were used");

	}
	
///////////////////////////////////////////////////////////////////
/// incorrectFormatPrompt
/// Input : None
/// Output: text in the console
/// Generates a prompt in the console for when the user's entry
/// is in the incorrect format.
/// 
///////////////////////////////////////////////////////////////////
	
	public void incorrectFormatPrompt() {
		System.out.println("Incorrect Format Input. Please enter an integer between 1 and 1000");

	}

///////////////////////////////////////////////////////////////////
/// isCorrectFormat
/// Input : text input
/// Output: boolean true or false
/// 
///	If all chars in the string text input are between 0 and 9
///	return true, otherwise return false. Can be used to check
/// for entries other than integers.
/// 
///////////////////////////////////////////////////////////////////
	
	public boolean isCorrectFormat(String input) {
		String regex = "[0-9]+";
		if(input.matches(regex)) {
			return true;
		}else {
			return false;
		}
	}

///////////////////////////////////////////////////////////////////
/// isNotEmpty
/// Input : text input
/// Output: boolean true or false
/// 
///	If the string text input is blank or contains a space,
/// return false, otherwise return true. Can be used to
/// check for incorrect format from users.
/// 
///////////////////////////////////////////////////////////////////
	
	public boolean isNotEmpty(String input) {
		if(input.isBlank()) {
			return false;
		}else {
			return true;
		}
	}
	
///////////////////////////////////////////////////////////////////
/// getGeneratedNumber
/// Input : none
/// Output: an int variable "generatedNumber"
/// 
///	returns generatedNumber
/// 
///////////////////////////////////////////////////////////////////
	
	public int getGeneratedNumber() {
		return generatedNumber;
	}
	
///////////////////////////////////////////////////////////////////
/// setGeneratedNumber
/// Input : int number
/// Output: none
/// 
///	Set generatedNumber to value of Number.
/// 
///////////////////////////////////////////////////////////////////
	public void setGeneratedNumber(int number) {
		this.generatedNumber = number;
	}
}
