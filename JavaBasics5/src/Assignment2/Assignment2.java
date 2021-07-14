/**
 * 
 */
package Assignment2;

import java.util.Arrays;

/**
 * Java Basics 5 - Assignment 2
 * Given a list of non-negative integers, return an integer list of the
 * rightmost digits. (Note: use %)
 * 
 * @author Daniel Wilson
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call rightDigit method, pass a given array, and display results
		System.out.println(Arrays.toString(rightDigit(new int[] { 1, 22, 93 })));
		System.out.println(Arrays.toString(rightDigit(new int[] { 16, 8, 886, 8, 1 })));
		System.out.println(Arrays.toString(rightDigit(new int[] { 10, 0 })));

	}

	// Method accepts an int array as an argument,
	// determines the rightmost digit, and reassigns
	// the current element with the result of the calculation.
	public static int[] rightDigit(int[] list) {
		for (int ind = 0; ind < list.length; ind++) {
			list[ind] = list[ind] % 10;
		}
		return list;
	}

}
