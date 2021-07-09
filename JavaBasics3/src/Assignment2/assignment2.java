/**
 * 
 */
package Assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Java Basics 3 - Assignment 2
 * Write a Java program to append text to an existing file.
 * @author Daniel Wilson
 *
 */
public class assignment2 {

	/**
	 * Program creates an instance of itself and that instance calls
	 * the readFromFileAppend() method to read  an existing .txt file.
	 * The method then creates a pre-written String and uses it to
	 * append the String to a new line each time the program is run.
	 * The method reads and displays the appended .txt file.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an instance of this class
		assignment2 ios = new assignment2();
		// The instance calls the readFromFileAppend method
		ios.readFromFileAppend();

	}
	
	// Method reads in a .txt file, appends text to a new line and displays the contents of the file
	public void readFromFileAppend() {
		// BufferedReader created inside try() to ensure resource is closed when program finishes
		// operations with the file it is reading/writing to
		try (BufferedReader in = new BufferedReader(new FileReader("resources/assignment2_appendTextFile.txt"))) {
			
			// String created and written to existing file
			String textToAppend = "\nNew Text Added After Running.";
			Files.write(Paths.get("resources/assignment2_appendTextFile.txt"), textToAppend.getBytes(), StandardOpenOption.APPEND);
			
			// New String created and used to help display the contents of the appended file
			String readNewText;
			while((readNewText = in.readLine()) != null) {
				System.out.println(readNewText);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
