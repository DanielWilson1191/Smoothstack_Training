/**
 * 
 */
package Assignment3;

import java.util.Random;
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
public class ProduceInts implements Runnable {
	
	// A queue is initialized
	BlockingQueue<Integer> ProduceQueue = null;

	// Parameterized constructor assigns the queue above with a queue passed as an argument
	public ProduceInts(BlockingQueue<Integer> queue) {
		this.ProduceQueue = queue;
	}

	@Override
	public void run() {
		// Thread generates random ints from 1 - 100 and puts the int into the queue
		// every half second. Once 5 ints are produced, the thread will end.

		for (int i = 0; i < 5; i++) {
			Random r = new Random();
			Integer num = r.nextInt(100 - 1) + 1;
			try {
				this.ProduceQueue.put(num);
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
