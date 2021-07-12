/**
 * 
 */
package Assignment1;

/**
 * Implement a Singleton with double checked locking.
 * @author Daniel Wilson
 *
 */
public class implementTheSingleton {

	/**
	 * Main generates an instance on the singleton and accesses a method within it.
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate an instance of the singleton class with getInstance method
		assignment1 sing1 = assignment1.getInstance();
		// Display the example text from the instance
		System.out.println(sing1.getExample());

	}

}
