package Assignment1;

/**
 * Java Basics 4 - Assignment 1
 * Implement a Singleton with double checked locking.
 * @author Daniel Wilson
 *
 */
public class assignment1 {

	private static final Object object = new Object();
	private static volatile assignment1 instance = null;

	private static volatile String example;

	private assignment1() {
		example = "This is a Singleton Class!";

	}

	public static assignment1 getInstance() {
		if (instance != null) {
			return instance;
		}
		synchronized (object) {
			if (instance == null) {
				instance = new assignment1();
			}
			return instance;
		}
	}
	
	public String getExample() {
		return example;
	}
}
