/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.Month;
import java.time.YearMonth;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 2
 * Write an example that, for a given year, reports
 * the length of each month within that year.
 * @author Daniel Wilson
 *
 */
public class lengthOfMonthsInYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an int variable to hold the year value
		int year = 2012;
		// Iterate through the Months of the Year
		for(Month m: Month.values()) {
			// Combine the year and month to get a date time that displays only the year and month values
			YearMonth ym = YearMonth.of(year, m);
			// Display the length of each month based on the given year to determine how many days each month contains
			System.out.println(m + " has " + ym.lengthOfMonth() + " days");
			System.out.println(ym);
		}

	}

}
