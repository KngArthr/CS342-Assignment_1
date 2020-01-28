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


//// Class:  mainClass
//
// Description:
//All the things needed to support my class.  Myclass is a class that
//does class like things.  It has methods, and data, etc.
//
package cs342_AssignmentOne;
public class MainClass {

	public static void main(String[] args) {
		int gameCounter;
		String userInput;
		
		do {
			gameCounter = 0;
			User user = new User();
			Console console = new Console();
			console.initialPrompt();
			do {
				

				userInput = user.scanInput();
				
				if(console.isCorrectFormat(userInput) && console.isNotEmpty(userInput)) {
					gameCounter++;
					user.setTurnsUsed(gameCounter);
					user.setInputNumber(Integer.parseInt(userInput));
					if(user.getInputNumber() < console.getGeneratedNumber()) {
						console.lowGuessPrompt(Integer.parseInt(userInput));
					}
					if(user.getInputNumber() > console.getGeneratedNumber()) {
						console.highGuessPrompt(Integer.parseInt(userInput));
					}
					if(user.getInputNumber() == console.getGeneratedNumber()) {
						console.correctGuessPrompt(gameCounter);
					}
				}else {
					console.incorrectFormatPrompt();
				}
				
				
				
			}while(user.getInputNumber() != console.getGeneratedNumber());
			
			System.out.println("Press 0 if you would like to start again. Press 1 to exit");
			gameCounter = Integer.parseInt(user.scanInput());
			
		}while(gameCounter == 0);

	}

}
