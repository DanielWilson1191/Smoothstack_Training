/**
 * 
 */
package assignment4Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Assignment4.Assignment4;

/**
 * JUnit tests that utilize the noX Functional Lambda from Assignment4 class.
 * 
 * @author Daniel Wilson
 *
 */
class noXTest {

	@Test
	public void removeXsTest() {
		assertArrayEquals(new String[] {"a", "bb", "c"}, Assignment4.noX.noX(new String[] { "ax", "bb", "cx" }));
		assertArrayEquals(new String[] {"a", "bb", "c"}, Assignment4.noX.noX(new String[] { "xxax", "xbxbx", "xxcx" }));
		assertArrayEquals(new String[] {""}, Assignment4.noX.noX(new String[] { "x" }));
	}

}
