/**
 * 
 */
package Assignment3;

import java.util.Arrays;

/**
 * Java Basics 5 - Assignment 3
 * Given a list of integers, return a list where each integer is multiplied by 2.
 * 
 * @author Daniel Wilson
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call doubling method, pass a given array, and display results
		System.out.println(Arrays.toString(doubling(new int[] { 1, 2, 3 })));
		System.out.println(Arrays.toString(doubling(new int[] { 6, 8, 6, 8, -1 })));
		System.out.println(Arrays.toString(doubling(new int[] {  })));

	}

	// Method accepts an int array as an argument,
	// doubles each element, and reassigns the
	// current element with the result of each calculation.
	public static int[] doubling(int[] list) {
		for (int ind = 0; ind < list.length; ind++) {
			list[ind] = list[ind] * 2;
		}
		return list;
	}

}
