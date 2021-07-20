/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 2
 * Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
 * @author Daniel Wilson
 *
 */
public class birthdayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Use the ZonedDateTime class or LocalDateTime class to store the value of a birthday
		// Both classes can store in years, months, days, seconds, and nanoseconds
		ZonedDateTime birthday = ZonedDateTime.of(1991, 11, 26, 22, 30, 10, 39, ZoneId.of("America/New_York"));
		System.out.println(birthday.getMonthValue() + " " + birthday.getDayOfMonth() + " " + birthday.getYear());
		

	}

}
