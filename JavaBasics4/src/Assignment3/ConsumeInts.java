/**
 * 
 */
package Assignment3;

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
public class ConsumeInts implements Runnable {
	// A queue is initialized
	BlockingQueue<Integer> ConsumeQueue = null;

	// Parameterized constructor assigns the queue above with a queue passed as an argument
	public ConsumeInts(BlockingQueue<Integer> queue) {
		this.ConsumeQueue = queue;
	}

	@Override
	public void run() {
		// Thread Takes up to 5 ints from the queue and displays them as they're consumed
		int counter = 0;
		
		while (counter < 5) {
			try {
				Integer num = this.ConsumeQueue.take();
				System.out.println("Int consumed: " + num);
				counter++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
