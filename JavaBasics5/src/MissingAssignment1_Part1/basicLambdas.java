/**
 * 
 */
package MissingAssignment1_Part1;

import java.util.Arrays;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 1
 * Basic lambdas. Make an array containing a few Strings. Sort it by:
 * length (i.e., shortest to longest)
 * reverse length (i.e., longest to shortest)
 * alphabetically by the first character only 
 * Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
 * Re-do the previous problem, but use a static helper method so that your lambda looks like this:
 * Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))
 * 
 * @author Daniel Wilson
 *
 */
public class basicLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an array containing a few Strings to be sorted in various ways
		String[] strArray = {"Robert", "Julian", "Daniel", "Sean", "Kevin", "Carlos"};

		// Sorted by length
		System.out.println("Sorted list by length");
		Arrays.sort(strArray, (o1, o2) -> (o1.length() - o2.length()));
		display(strArray);

		// Sorted by reverse length
		System.out.println("\n\nSorted list by reverse length");
		Arrays.sort(strArray, (o1, o2) -> (o2.length() - o1.length()));
		display(strArray);

		// Sorted alphabetically by the first character only
		System.out.println("\n\nSorted list by alphabetically by the first character only");
		Arrays.sort(strArray, (o1, o2) -> (o1.charAt(0) - o2.charAt(0)));
		display(strArray);

		// Sorted by Strings that contain “e” first, everything else second.
		System.out.println("\n\nSorted list by Strings that contain “e” ");
		Arrays.sort(strArray, (o1, o2) -> (((int) o2.chars().filter(ch -> ch == 'e').count())
				- ((int) o1.chars().filter(ch -> ch == 'e').count())));
		display(strArray);

		// Sorted the same as previous sorting, but using a static helper method
		System.out.println("\n\nSorted list by Strings that contain “e” using helper method");
		Arrays.sort(strArray, (s1,s2) -> compareCharCount(s1,s2));
		display(strArray);

	}

	// Helper method compares the count of the char 'e' in 2 Strings
	// Used to sort by String with the most e's descending to no e's 
	static int compareCharCount(String o1, String o2) {
		return ((int) o2.chars().filter(ch -> ch == 'e').count()) - ((int) o1.chars().filter(ch -> ch == 'e').count());
	}
	
	// Method displays the contents of any String array passed as an argument
	static void display(String[] sortedArray) {
		for (String ele : sortedArray) {
			System.out.print(ele + " ");
		}
	}

}
