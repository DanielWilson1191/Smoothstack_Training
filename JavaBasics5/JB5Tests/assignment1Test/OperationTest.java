package assignment1Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Assignment1.Assignment1;

/**
 * JUnit tests that utilize the selectOperation method from Assignment1 class.
 * 
 * @author Daniel Wilson
 *
 */
public class OperationTest {

	@Test
	public void testOdd() {

		assertEquals("EVEN", Assignment1.selectOperation(1, 4));
		assertEquals("ODD", Assignment1.selectOperation(1, 3));
	}

	@Test
	public void testPrime() {
		assertEquals("PRIME", Assignment1.selectOperation(2, 5));
		assertEquals("COMPOSITE", Assignment1.selectOperation(2, 12));
	}

	@Test
	public void testPalindrome() {
		assertEquals("PALINDROME", Assignment1.selectOperation(3, 898));
	}

}
