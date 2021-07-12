/**
 * 
 */
package Assignment2;

/**
 * Java Basics 4 - Assignment 2 Write a program to create a deadlock between two
 * threads.
 * 
 * @author Daniel Wilson
 *
 */
public class assignment2 {

	/**
	 * Program creates 2 String resources and 2 threads. Both threads will lock 1
	 * unique resource each and as they finish and attempt to lock the other
	 * resource, it is already locked by the other thread. Neither thread will be
	 * able to release the lock on their resource, until the other resource is
	 * released, creating a deadlock.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate 2 "resources" for the threads to compete for
		String resource1 = "This is Resource 1.";
		String resource2 = "This is Resource 2.";

		// Create the first thread
		Thread thread1 = new Thread() {

			// Define what the run method does
			public void run() {
				try {
					// Thread1 will lock the first resource and announce that it has done so
					synchronized (resource1) {
						System.out.println("resource1 is locked by thread1");

						// Thread1 will attempt to lock resource2, but shouldn't be able to
						// until Thread2 releases its lock
						synchronized (resource2) {
							System.out.println("resource2 is locked by thread1");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Create the second thread
		Thread thread2 = new Thread() {

			// Define what the run method does
			public void run() {
				try {
					// Thread2 will lock the second resource and announce that it has done so
					synchronized (resource2) {
						System.out.println("resource2 is locked by thread2");

						// Thread2 will attempt to lock resource1, but shouldn't be able to
						// until Thread1 releases its lock
						synchronized (resource1) {
							System.out.println("resource1 is locked by thread2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Start both threads, which auto-runs the run() method
		thread1.start();
		thread2.start();
	}

}
