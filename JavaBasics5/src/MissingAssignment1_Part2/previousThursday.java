/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Daniel Wilson
 *
 */
public class previousThursday {

	/**
	 * Java Basics 5 - Missing Assignment 1 - Part 2
	 * Given a random date, how would you find the date of the previous Thursday?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//	Create a date
		LocalDateTime currentDate = LocalDateTime.now();
		//	Find the date of the previous Thursday by using the starting date and .with()
		//	with TemporalAdjusters.previous() and input the DayOfWeek. and provide which
		//	day of the week you're looking for.
		LocalDateTime datePreviousThursday = currentDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		//	Display the date of the previous Thursday
		System.out.println(datePreviousThursday.getMonth() + " " + datePreviousThursday.getDayOfMonth() + ", "
				+ datePreviousThursday.getYear());

	}

}
