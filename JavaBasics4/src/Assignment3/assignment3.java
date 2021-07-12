/**
 * 
 */
package Assignment3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Java Basics 4 - Assignment 3
 * Write a program with one thread (the producer) that produces items
 * (in this case, simple ints). Another thread (the consumer) consumes
 * items. For communication purposes, both threads have access to a
 * bounded buffer which is basically an array. 
 * @author Daniel Wilson
 *
 */
public class assignment3 {

	/**
	 * Program creates a queue to store data created in a producer thread.
	 * A Producer and Consumer class are instantiated and passed to 1 thread
	 * each. Both threads are started and carry out their operations before
	 * stopping and ending the program.
	 * @param args
	 */
	public static void main(String[] args) {
		// Queue is created with space to store up to 5 elements
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

		// Producer and Consumer classes are instantiated with the queue passed into each
		ProduceInts producer = new ProduceInts(queue);
		ConsumeInts consumer = new ConsumeInts(queue);

		// 2 Threads are created and passed their respective objects
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		// Both threads are started and program ends when their operations finish
		producerThread.start();
		consumerThread.start();

	}

}
