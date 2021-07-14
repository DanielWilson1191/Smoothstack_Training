/**
 * 
 */
package Assignment6;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Java Basics 5 - Assignment 6
 * Fix the below Singleton class
 * @author Daniel Wilson
 *
 */
public class FixSingleton {
	// Added final and volatile to ensure thread safety
	// and only 1 Connection can be created
	private static final Connection conn = null;

	private static volatile FixSingleton instance = null;

	public static FixSingleton getInstance() {
		// Added double checked locking
		// to ensure only 1 instance of
		// the singleton can be created
		if(instance != null) {
			return instance;			
		}
		synchronized (conn) {
			if (instance == null) {
				instance = new FixSingleton();
			}
			return instance;
		}
	}

}
