/**
 * 
 */
package MissingAssignment1_Part2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

/**
 * Java Basics 5 - Missing Assignment 1 - Part 2
 * What is the difference between a ZoneId and a ZoneOffset?
 * 
 * @author Daniel Wilson
 *
 */
public class zoneIdVSZoneOffset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//	A ZoneId specifies a time zone
		ZoneId zoneId1 = ZoneId.of("America/New_York");
		ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
		
		LocalDateTime zone1 = LocalDateTime.now(zoneId1);
		LocalDateTime zone2 = LocalDateTime.now(zoneId2);
		
		System.out.println("Two DateTimes generated from different zoneId's");
		System.out.println(zone1);
		System.out.println(zone2);
		
		//	A ZoneOffset defines the time difference between a specific time zone and UTC
		ZoneOffset zos = ZoneOffset.UTC;
		
		Temporal temp = zos.adjustInto(ZonedDateTime.now());
		
		System.out.println("\nDateTime generated from local time zone, including the zone's offset from UTC");
		System.out.println(temp);

	}

}
