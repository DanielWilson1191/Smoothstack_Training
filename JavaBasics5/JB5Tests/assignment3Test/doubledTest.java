/**
 * 
 */
package assignment3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment3.Assignment3;

/**
 * JUnit tests that utilize the doubling Functional Lambda from Assignment3 class.
 * 
 * @author Daniel Wilson
 *
 */
class doubledTest {

	@Test
	public void doublingTest() {
		assertArrayEquals(new int[] { 2,4,6 }, Assignment3.doubling.doubling(new int[] { 1, 2, 3 }));
		assertArrayEquals(new int[] { 12,16,12,16,-2 }, Assignment3.doubling.doubling(new int[] { 6, 8, 6, 8, -1 }));
		assertArrayEquals(new int[] {  }, Assignment3.doubling.doubling(new int[] {  }));
	}

}
