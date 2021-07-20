/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 2
 * How would you convert an Instant to a ZonedDateTime?
 * How would you convert a ZonedDateTime to an Instant?
 * 
 * @author Daniel Wilson
 *
 */
public class instantToZdtAndBack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an Instant
		Instant inst = Instant.now();
		System.out.println("Instant before converting to ZonedDateTime\n" + inst);
		//	Convert instant to ZonedDateTime
		ZonedDateTime zdt = ZonedDateTime.ofInstant(inst, ZoneId.systemDefault());
		System.out.println("\nZonedDateTime converted from Instant\n" + zdt);
		//	Convert ZDT to Instant again
		Instant inst2 = zdt.toInstant();
		System.out.println("\nInstant converted back from ZonedDateTime\n" + inst2);

	}

}
