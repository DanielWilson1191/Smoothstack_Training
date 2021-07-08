/**
 * 
 */
package assignment2;

/**
 * Java Basics 2 Assignment 2 Construct a 2D array and find the max number and
 * show its position in the array.
 * 
 * @author Daniel Wilson
 *
 */
public class Assignment2 {

	/**
	 * A 2-D array has been hard coded and an outer and inner loop
	 * iterates through the array, searching for the element with
	 * the largest value. Once a potential max number is found,
	 * the value and its position are stored. After evaluating
	 * all elements of the array, those values are displayed.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int max = 0;	// Variable holds the value of the largest number
		// StringBuilder is initialized to keep track of the position of the largest element
		StringBuilder maxPosition = new StringBuilder();
		// Hard coded 2-D array
		int[][] array = { { 8, 7, 92, 72, 10, 96, 23, 72, 91, 23 }, { 53, 84, 24, 28, 58, 84, 86, 29, 5, 87 } };

		// Iterate through entire array, searching for the largest element
		for (int outer = 0; outer < array.length; outer++) {
			for (int inner = 0; inner < array[outer].length; inner++) {
				// Determine whether the current element is larger than the previously largest element
				if (array[outer][inner] > max) {
					max = array[outer][inner];	// Assign the new found largest element to 'max'
					// Delete previous position and assign a new position
					maxPosition.setLength(0);
					maxPosition.append(outer + ", " + inner);
				}
			}
		}
		// Display the max and its position
		System.out.println("Max Number: " + max);
		System.out.println("At Position: " + maxPosition);

	}

}
