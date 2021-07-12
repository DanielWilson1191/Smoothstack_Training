package Assignment4Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Assignment4.Line;

/**
 * Java Basics 4 - Assignment 4 Create unit tests for the Line Class (see
 * video). 1) Create a file called LineTest.java. 2) Create tests for the
 * getSlope, getDistance, and parallelTo methods. 3) Because of rounding errors,
 * it is bad practice to test double values for exact equality. To get around
 * this, you can pass a small value (such as .0001) to assertEquals to be used
 * as a delta.
 * 
 * @author Daniel Wilson
 *
 */

public class LineTest {

	// Hard coded line objects for testing
	Line l1 = new Line(-1, 0, 3, 8);
	Line l2 = new Line(2, 4, 6, 12);
	Line l3 = new Line (-3, 15, 7, 10);

	// Test getSlope method using Line l1
	@Test
	public void testSlope() {
		double slope = l1.getSlope();
		assertEquals(2, slope);
		assertNotEquals(1.25, slope);
	}

	// Test getDistance method using Line l1
	@Test
	public void testDistance() {
		double dist = l1.getDistance();
		assertEquals(Math.sqrt(80), dist);
		assertNotEquals(128, dist);
	}

	// Test parallelTo method using Line l1, l2, and l3
	@Test
	public void testParallel() {
		assertTrue(l1.parallelTo(l2));
		assertFalse(l1.parallelTo(l3));
	}
}
