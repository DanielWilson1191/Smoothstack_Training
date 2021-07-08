package assignment1;

/**
 * Java Basics 2
 * Assignment 1
 *  Take multiple values from the command line and
 *  show the result of adding all of them.
 * @author Daniel Wilson
 *
 */
public class Assignment1 {

	/**
	 * Several values have been added to the command line args. Mostly integers with
	 * a few strings have been mixed in. The program iterates through the array,
	 * parses the values to find only the usable ints and find their total sum.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Variable to hold the total sum
		int total = 0;

		for (String ele : args) {
			// Try, Catch block to handle any invalid values in the array
			try {
				// Parse the String values in the array and convert to int and assign to variable
				total += Integer.parseInt(ele);
				System.out.println("Value Entered: " + ele);
				//total += value; // Add the parsed int to the total sum
				
			} catch (Exception e) {	// Handle any exception and report the invalid value
				System.out.println("Invalid value enetered: " + "\"" + ele + "\"");
			}
		}
		// Display the total sum of all usable values in the array
		System.out.println("Total: " + total);

	}

}
