//---------------------------------------------------------------------------
//
//  Number between 1 and 1000 game.
//     Has the user guess a number between 1 and 1000.
//
//  Author:    Mujahid Kazi
//  Date:      01/28/2018
//  Class:     MET CS342
//  Issues:    None known
//
//  Description:
//    This program will generate a random number between 1 and 1000
//	  and have the user guess the number. The program will log how
//	  many attempts the user takes to guess the correct number.
//	  The program will also check for anything that is not a number
//    including spaces and empty inputs. When the number is correctly
//    guessed, the program will announce the amount of turns taken
//    and the correct number.
//  Assumptions:
//    N/A
//


//
// Class:  MainClass
//
// Description:
// This is the main class where all the methods in the other classes
// are used to put together the program.
//
package cs342_AssignmentOne;
public class MainClass {
	
	
	///////////////////////////////////////////////////////////////////
	/// main
	/// Input : String[] args
	/// Output: none
	/// Puts the program together using the various classes and methods.
	/// 
	/// Runs in a do while loop which finishes once the variable gameCounter is not 0.
	/// gameCounter increments every turn which also helps record the amount of turns taken.
	/// User is given the option to change gameCounter to 0 to run the program again,
	/// or press 1 to end the program.
	/// 
	/// The program also contains a nested do while loop to simulate turns.
	///
	/// The program contains an initial prompt at the start.
	///
	/// The program then runs through the different prompts every turn based on if the user
	/// guessed correct, incorrect, high or low.
	/// 
	///////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		int gameCounter; //helps count turns as well as if the game needs to be restarted
		String userInput; //captures user input
		
		do {//loop to give user the option to run the program again
			
			User user = new User(); //generates a user object
			Console console = new Console(); // generates a console object
			
			gameCounter = 0; //no turns have gone so starts at 0
			
			console.initialPrompt(); //displays initial prompt on the console
			
			do {//loop for turns. Each pass through the loop is a turn
				

				userInput = user.scanInput();//Gather user input after the first prompt
				
				if(console.isCorrectFormat(userInput) && console.isNotEmpty(userInput)) {//if userinput contains only numbers and no blanks then true
					
					gameCounter++;//increment game counter for the turn
					
					user.setTurnsUsed(gameCounter);//store the amount of turns
					user.setInputNumber(Integer.parseInt(userInput));//store the user's input
					
					if(user.getInputNumber() < console.getGeneratedNumber()) {//if the user's input number is lower than the console's generated number, display the low guess prompt including the number guessed.
						console.lowGuessPrompt(Integer.parseInt(userInput));
					}
					
					if(user.getInputNumber() > console.getGeneratedNumber()) {//if the user's input number is higher than the console's generated number, display the high guess prompt including the number guessed.
						console.highGuessPrompt(Integer.parseInt(userInput));
					}
					
					if(user.getInputNumber() == console.getGeneratedNumber()) {//if the user's input number is equal to the console's generated number then display the correct guess prompt.
						console.correctGuessPrompt(gameCounter);
					}
					
				}else {//if user input contains blanks or anything other than numbers, display the incorect format prompt
					console.incorrectFormatPrompt();
				}
				
				
				
			}while(user.getInputNumber() != console.getGeneratedNumber());//run while the user's input number does not equal the console's generated number.
			
			System.out.println("Press 0 if you would like to start again. Press 1 to exit"); //user may decide to run the program again or exit.
			gameCounter = Integer.parseInt(user.scanInput());//gains user input to reset the game counter or exit
			
		}while(gameCounter == 0);//if game counter is reset then restart the program, otherwise end the program.

	}

}
