package cs342_AssignmentOne;

import java.util.*;

public class User {
	private int inputNumber;
	private int turnsUsed;
	Scanner scan = new Scanner(System.in);
	
	public User(){
	this.inputNumber = 0;
	this.turnsUsed = 0;
	}
	
	public String scanInput(){
		String userInput;
		userInput = scan.nextLine();
		return userInput;
	}
	
	public int getInputNumber(){
		return inputNumber;
	}
	
	
	public void setInputNumber(int input){
	this.inputNumber = input;
	}
	
	public int getTurnsUsed(){
		return turnsUsed;
	}
	
	public void setTurnsUsed(int turns){
		this.turnsUsed  = turns;
	}

}
