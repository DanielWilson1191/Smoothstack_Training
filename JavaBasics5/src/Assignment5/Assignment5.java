/**
 * 
 */
package Assignment5;

/**
 * Java Basics 5 - Assignment 5
 * 
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target, with this additional
 * constraint: if there are numbers in the array that are adjacent and the
 * identical value, they must either all be chosen, or none of them chosen. For
 * example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the
 * middle must be chosen or not, all as a group. (one loop can be used to find
 * the extent of the identical values).
 * 
 * groupSumClump(0, [2, 4, 8], 10) → true groupSumClump(0, [1, 2, 4, 8, 1], 14)
 * → true groupSumClump(0, [2, 4, 4, 8], 14) → false
 * 
 * 
 * @author Daniel Wilson
 *
 */
public class Assignment5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Displaying the return values of each test
		if (groupSumClump(0, new int[] { 2, 4, 8 }, 10)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
		if (groupSumClump(0, new int[] { 1, 2, 4, 8, 1 }, 14)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
		if (groupSumClump(0, new int[] { 2, 4, 4, 8 }, 14)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}

	/**
	 * Method is given 2 int values and an int array and recursively finds whether a
	 * sum of ints from the array may equal the target variable. If a series of
	 * consecutively equal values are found, they are summed together and must be
	 * used as a single choice.
	 * 
	 * @param start  The starting location of the element being picked as part of
	 *               the values being summed.
	 * @param list   An int array of values available to sum together in the search
	 *               for the target value.
	 * @param target The value that the sum from the given array should equate to.
	 * 
	 */
	public static boolean groupSumClump(int start, int[] list, int target) {
		if (target == 0) { 	// If the target value is brought to 0,
			return true; 	// A possible sum combination has been found in the given array.
		} else if (start >= list.length) { 	// If the end of the array has been reached
			return false; 					// no combination exists (either in a branch or at all).
		} else {
			// Otherwise, begin the search
			// Use start location in array to assign a potential end location
			int end = start;
			int sum = 0; // Set/Reset sum of clump to zero
			// Loop uses end value as index location to start searching for possible clumps
			// If consecutive equal values are found, find sum and increment ending location
			// If no match found, end loop and use sum of clump as single value
			while (end < list.length && list[start] == list[end]) {
				sum += list[end];
				end++;
			}
			// Return the result of the recursive search by choosing to use the current
			// element or not, creating a tree of possible combinations until a target
			// match is found or the end of all combinations return false with no target match.
			return groupSumClump(end, list, target - sum) || groupSumClump(end, list, target);
		}
	}
}
