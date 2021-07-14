/**
 * 
 */
package Assignment4;

import java.util.Arrays;

/**
 * Java Basics 5 - Assignment 4
 * Given a list of strings, return a list where each string has all its "x"
 * removed.
 * 
 * @author Daniel Wilson
 *
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call doubling method, pass a given array, and display results
		System.out.println(Arrays.toString(noX(new String[] { "ax", "bb", "cx" })));
		System.out.println(Arrays.toString(noX(new String[] { "xxax", "xbxbx", "xxcx" })));
		System.out.println(Arrays.toString(noX(new String[] { "x" })));

	}

	// Method accepts a String array as an argument,
	// removes each instance of the char "x" from entire
	// String, and reassigns the current element with
	// the result of each reformatting.
	public static String[] noX(String[] list) {
		for (int ind = 0; ind < list.length; ind++) {
			list[ind] = list[ind].replace("x", "");
		}
		return list;
	}

}
