/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 2
 * Write an example that, for a given month of the
 * current year, lists all of the Mondays in that month.
 * @author Daniel Wilson
 *
 */
public class mondaysOfMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a month object to hold value of the given month
		Month month = Month.APRIL;
		// Create LocalDate for current Year, given month and 1st day of month
		// Utilize .with method along with TemporalAdjusters and firstInMonth to find the first Monday
		// Even if it is the 1st day in the given month
		LocalDate date = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		// Set a control month variable to compare to for the loop
		Month m = date.getMonth();
		// Utilize the .with method to find the next Monday until the month has been fully searched
		while(m == month) {
			// Display the date of the Monday found
			System.out.println(date);
			// Reassign the date to the next Monday on the calendar
			date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			// Update the Month to check against the control month variable
			m = date.getMonth();
		}

	}

}
