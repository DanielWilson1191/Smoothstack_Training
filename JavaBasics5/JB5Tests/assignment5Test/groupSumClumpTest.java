/**
 * 
 */
package assignment5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment5.Assignment5;

/**
 * @author Daniel Wilson
 *
 */
class groupSumClumpTest {

	@Test
	public void trueTest() {
		assertEquals(true, Assignment5.groupSumClump(0, new int[] { 2, 4, 8 }, 10));
		assertEquals(true, Assignment5.groupSumClump(0, new int[] { 1, 2, 4, 8, 1 }, 14));
	}
	
	@Test
	public void falseTest() {
		assertEquals(false, Assignment5.groupSumClump(0, new int[] { 2, 4, 4, 8 }, 14));
	}

}
