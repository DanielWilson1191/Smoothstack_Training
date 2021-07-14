/**
 * 
 */
package Assignment1;

/**
 * Java Basics 5 - Assignment 1
 * Write the following methods that return a lambda expression performing a
 * specified action:
 * 
 * 	PerformOperation isOdd(): The lambda expression must return if a number is
 * 	odd or if it is even.
 * 
 * 	PerformOperation isPrime(): The lambda expression must
 * 	return if a number is prime or if it is composite.
 * 	PerformOperation isPalindrome(): The lambda expression must return if a
 * 	number is a palindrome or if it is not.
 * 
 * @author Daniel Wilson
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Call the selectOperation method to perform the check
		// required based on which operation is needed.

		selectOperation(1, 4);
		selectOperation(2, 5);
		selectOperation(3, 898);
		selectOperation(1, 3);
		selectOperation(2, 12);

	}

	// Lambda expression using functional interface
	// Determines if an int is odd or even
	static PerformOperation isOdd = (i) -> {
		String result = (i % 2 > 0) ? "ODD" : "EVEN";
		return result;

	};

	// Lambda expression using functional interface
	// Determines if an int is Prime or Composite
	static PerformOperation isPrime = (i) -> {
		StringBuffer result = new StringBuffer("PRIME");
		if (i % 2 == 0) {
			result.setLength(0);
			result.append("COMPOSITE");
		}

		for (int index = 3; index * index <= i; index += 2) {
			if (i % index == 0) {
				result.setLength(0);
				result.append("COMPOSITE");
			}
		}
		return result.toString();
	};

	// Secondary Prime checker in case the used version is determined incorrect
//	static PerformOperation isPrime = (i) -> {
//		StringBuffer result = new StringBuffer("PRIME");
//
//		if (i <= 1) {
//			result.setLength(0);
//			result.append("COMPOSITE");
//		}
//
//		for (int ind = 2; ind < i; ind++) {
//			if (i % ind == 0) {
//				result.setLength(0);
//				result.append("COMPOSITE");
//			}
//		}
//	    return result.toString();
//	};

	// Lambda expression using functional interface
	// Determines if an int is a Palindrome or not
	static PerformOperation isPalindrome = (i) -> {
		int rem, sum = 0, temp;
		String result;

		temp = i;
		while (i > 0) {
			rem = i % 10;
			sum = (sum * 10) + rem;
			i = i / 10;
		}
		result = (temp == sum) ? "PALINDROME" : "NOT PALINDROME";
		return result;
	};

	// Method accepts 2 ints, first is the switch case to be used and
	// second is the int to be passed to the lambda function selected.
	// Displays and returns the String result of the selected lambda function.
	public static String selectOperation(int choice, int testNum) {

		String result = "";
		switch (choice) {
		case 1:
			result = isOdd.performOperation(testNum);
			break;

		case 2:
			result = isPrime.performOperation(testNum);
			break;

		case 3:
			result = isPalindrome.performOperation(testNum);
			break;
		}

		System.out.println(result);
		return result;
	}

}
