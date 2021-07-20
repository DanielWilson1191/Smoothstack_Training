/**
 * 
 */
package MissingAssignment1_Part1;

import java.util.Arrays;
import java.util.List;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 1
 * Using Java 8 features write a method that returns a comma separated string
 * based on a given list of integers. Each element should be preceded by the
 * letter 'e' if the number is even, and preceded by the letter 'o' if the
 * number is odd. For example, if the input list is (3,44), the output should
 * be 'o3,e44'.
 * 
 * @author Daniel Wilson
 *
 */
public class evenOddString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a List of Integers
		List<Integer> list = Arrays.asList(3, 44, 600, 57, 5, 269);
		// Call the method to alter the list based on the values being even or odd and display
		System.out.println(evensOddsString(list));

	}

	//	Method accepts a List of Integers, creates a String that adds an 'e' or 'o' before each
	//	value, depending on it being even or odd, separating each new value with a comma, and
	//	returns a String with the final extra comma removed.
	public static String evensOddsString(List<Integer> list) {
		StringBuilder output = new StringBuilder();
		list.forEach(n -> {
			if (n % 2 == 0) {
				output.append("e" + n + ",");
			} else {
				output.append("o" + n + ",");
			}
		});
		return output.substring(0, output.length() - 1);
	}

}
