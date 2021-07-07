package javaBasics1;

import java.util.Random;
import java.util.Scanner;

/*
 * Daniel Wilson
 * Assignment 2
 * Generate number between 1-100
 * User asked to guess the correct number generated
 * 		Validate the user input
 * Test user's guess against the correct number generated
 * 		Determine if guess is within acceptable range
 * If guess is within 10 (plus or minus) output correct answer and exit
 * If guess is not within 10, ask user to keep guessing
 * If user does not succeed within 5 attempts, display "Sorry," with correct answer and exit
 */

public class Assignment2 {

	public static void main(String[] args) {
		// Initialize variables to allow them to be in scope until end of program
		int guess = 0, correctNum = 0, attempts = 0;
		boolean result = false;
		
		// Call the method to generate the correct number and assign it to appropriate variable
		correctNum = correctNumberGenerator();	
		
		// Prompt user on rules of the game
		System.out.println("You have 5 attempts to guess within 10 of the correct number!");
		
		// Loop until User is out of attempts
		while(attempts < 5) {
			// Call the method to prompt and request a guess number from User and assign to appropriate variable
			guess = requestNum();
			System.out.println("Guess: " + guess);
			
			// Call the method to test the User's guess to the randomly generated correct number and assign to appropriate variable
			result = numberCheck(guess, correctNum);
			
			// Determine whether a correct answer has been given and inform User of the results
			if (result) {
				System.out.println("Correct Number: " + correctNum);
				System.out.println("You're guess was within 10!");
				break;
			}
			else {
				System.out.println("You're guess was not within 10...");
			}
			
			attempts++;	// Increment the number of attempts made
		}
		
		// Determine if the number of maximum attempts allowed has been reached and inform the User
		if(attempts >= 5) {
			System.out.println("Sorry, the correct number was " + correctNum);
		}
		
		
		
		
	}
	
	// correctNumberGenerator method randomly generates an integer between 1 and 100 and returns the result
	public static int correctNumberGenerator() {
		Random r = new Random();
		int lowest = 1;
		int highest = 100;
		int correctNum = r.nextInt(highest - lowest) + lowest;
		//System.out.println("Random Number: " + correctNum);
		return correctNum;
	}
	
	// requestNum method prompts the User, requests and validates the input, and returns the input integer as their guess
	public static int requestNum() {
		int guess = 0;
		// Create a Scanner to accept User input
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter number in range of 1 - 100
		while(true) {
			System.out.println("Guess a number between 1 and 100: ");
			
			// Validate the input to be an integer that is within requested range
			if(input.hasNextInt()) {
				guess = input.nextInt();
				if(guess >= 1 && guess <= 100) {
					//System.out.println(guess + " is a valid integer!");
					break;
				}
				else {
					System.out.println(guess + " is an invalid integer!");
				}
			}
			else {
				System.out.println(input.next() + " is an invalid integer!");
			}
		}
		
		return guess;	//  Returns the validated User input as their guess
	}
	
	// numberCheck method determines if the User's guess is within 10 of the correct number and returns a boolean result
	public static boolean numberCheck(int guess, int correctNum) {
		boolean guessCorrect = false;
		int guessRange = 10;
		int positiveSearch = guess, negativeSearch = guess;	// Variables used to check in the plus or minus directions of the User's guess
		int counter = 1;	// Used to determine how far into the plus or minus the guessed input is being checked
		
		// Quick check to determine if the exact number has been guessed correctly, skipping the for loop
		if(guess == correctNum) {
			return true;
		}
		
		// Searching in both plus and minus directions to determine if the guess is within the requested range of 10
		for(int index = 0; index < guessRange; index++) {
			positiveSearch += counter;
			negativeSearch -= counter;
			// Assign true to a variable if either search has found a match to the range requirements, or false if match has not been found
			guessCorrect = (positiveSearch == correctNum || negativeSearch == correctNum) ? true : false;
			if (guessCorrect) {break;}	// End search early if match has been found
		}
		return guessCorrect;	// Return results of the search
	}
	

}
