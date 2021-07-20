/**
 * 
 */
package assignment2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment2.Assignment2;

/**
 * JUnit tests that utilize the rightDigit Functional Lambda from Assignment2 class.
 * 
 * @author Daniel Wilson
 *
 */
class rightDigitTest {

	@Test
	public void rightMostTest() {
		assertArrayEquals(new int[] { 1, 2, 3 }, Assignment2.rightDigit.rightDigit(new int[] { 1, 22, 93 }));
		assertArrayEquals(new int[] { 6, 8, 6, 8, 1 }, Assignment2.rightDigit.rightDigit(new int[] { 16, 8, 886, 8, 1 }));
		assertArrayEquals(new int[] { 0, 0 }, Assignment2.rightDigit.rightDigit(new int[] { 10, 0 }));
	}

}
