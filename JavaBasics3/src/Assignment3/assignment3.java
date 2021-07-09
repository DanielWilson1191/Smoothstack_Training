/**
 * 
 */
package Assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java Basics 3 - Assignment 3
 * Write a Java program that counts the number of times
 * a particular character, such as 'e', appears in a file.
 * The character can be specified at the command line. 
 * @author Daniel Wilson
 *
 */
public class assignment3 {

	/**
	 * Program creates an instance of itself and calls the
	 * countCharsInFile() method. This method reads the .txt
	 * file created in the Java Basics 3 - Assignment 2 and
	 * keeps count of the times the letter N appears. It then
	 * displays that count. This number should change based
	 * on the number of times the assignment2 program is run,
	 * as it will continue to add more characters that match
	 * the character being searched for.
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an instance of this class
		assignment3 ios = new assignment3();
		// The instance calls the countCharsInFile method
		ios.countCharsInFile();

	}
	
	// Method reads the file created in assignment2, keeps count of the letter N and displays it
	public void countCharsInFile() {
		// Counter keeping track of the times a specific character is found
		int charCount = 0;
		// BufferedReader created inside try() to ensure resource is closed when program finishes
		// operations with the file it is reading
		try(BufferedReader in = new BufferedReader(new FileReader("resources/assignment2_appendTextFile.txt"))){
			
			String text;
			while((text = in.readLine()) != null) {
				// Placeholder String is converted to a character array
				for(char ele: text.toCharArray()) {
					if(ele == 'n' || ele == 'N')	// If the character in the array is an N (case-insensitive)
						charCount++;				// the counter increments
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Display the results of the search for the specified character in the file
		System.out.println("The number of times letter N appears in File: " + charCount);
	}

}
