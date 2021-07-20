/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Daniel Wilson
 *
 */
public class checkForFriday13th {

	/**
	 * Java Basics 5 - Missing Assignment 1 - Part 2
	 * Write an example that tests whether a given date
	 * occurs on Friday the 13th.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Create LocalDates to test if they are on a Friday 13th
		LocalDate date1 = LocalDate.of(2020, 11, 13);
		LocalDate date2 = LocalDate.of(2020, 3, 13);
		LocalDate date3 = LocalDate.of(2012, 5, 13);
		System.out.println(friday13th(date1));
		System.out.println(friday13th(date2));
		System.out.println(friday13th(date3));
		

	}
	
	// Method accepts a LocalDate and returns true if the DayOfMonth is 13
	// and the DayOfWeek is Friday. All else returns false.
	public static boolean friday13th(LocalDate date) {
		if((date.getDayOfMonth() == 13) &&
				(date.getDayOfWeek() == DayOfWeek.FRIDAY)) {
			return true;
		}else
			return false;
	}

}
