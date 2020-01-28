//
// Class:  User
//
// Description:
// This is the console class where physical "User" object resides.
// The User stores the users input and also the amount of turns the
// user took. There is also a method for receiving the user's input.
// 


package cs342_AssignmentOne;

import java.util.*;

public class User {
	private int inputNumber;
	private int turnsUsed;
	Scanner scan = new Scanner(System.in);
	
///////////////////////////////////////////////////////////////////
/// User
/// Input : None
/// Output: None
/// Constructor for User class. Stores
/// the user's input number and the amount of turns used.
///////////////////////////////////////////////////////////////////
	
	public User(){
	this.inputNumber = 0;
	this.turnsUsed = 0;
	}
	
///////////////////////////////////////////////////////////////////
/// scanInput
/// Input : None
/// Output: String text
/// Uses scanner to intake user's input as a String.
/// Returns the String.
///////////////////////////////////////////////////////////////////
	
	public String scanInput(){
		String userInput;
		userInput = scan.nextLine();
		return userInput;
	}
	
///////////////////////////////////////////////////////////////////
/// getInputNumber
/// Input : None
/// Output: integer
/// returns integer value under inputNumber.
///////////////////////////////////////////////////////////////////
	
	public int getInputNumber(){
		return inputNumber;
	}

///////////////////////////////////////////////////////////////////
/// setInputNumber
/// Input : integer input
/// Output: none
/// sets the inputNumber variable to the value of input.
///////////////////////////////////////////////////////////////////
	
	
	public void setInputNumber(int input){
	this.inputNumber = input;
	}
	
///////////////////////////////////////////////////////////////////
/// getTurnsUsed
/// Input : None
/// Output: integer
/// returns integer value under turnsUsed.
///////////////////////////////////////////////////////////////////
	
	public int getTurnsUsed(){
		return turnsUsed;
	}
	
///////////////////////////////////////////////////////////////////
/// setTurnsUsed
/// Input : integer turns
/// Output: none
/// sets the turnsUsed variable to the value of turns.
///////////////////////////////////////////////////////////////////
	
	public void setTurnsUsed(int turns){
		this.turnsUsed  = turns;
	}

}
