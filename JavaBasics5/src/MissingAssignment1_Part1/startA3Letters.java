/**
 * 
 */
package MissingAssignment1_Part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel Wilson
 *
 */
public class startA3Letters {

	/**
	 * Java Basics 5 - Missing Assignment 1 - Part 1 3.
	 * Given a list of Strings, write a method that returns a list of all
	 * strings that start with the letter 'a' (lower case) and have exactly
	 * 3 letters. TIP: Use Java 8 Lambdas and Streams API's.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a List of Strings
		List<String> list = Arrays.asList("apples", "art", "ape", "see", "run", "phone", "drive");
		// Call the method to filter the list and use a forEach Lambda to display each value left
		startA3Letters(list).forEach(e -> System.out.println(e));

	}

	//	Method uses stream to filter the Strings in the List and return
	//	only values that have a length of 3 and start with the letter 'a'
	public static List<String> startA3Letters(List<String> list) {

		return list.stream().filter(e -> e.charAt(0) == 'a' && e.length() == 3).collect(Collectors.toList());
	}

}
