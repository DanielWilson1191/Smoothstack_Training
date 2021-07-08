/**
 * 
 */
package assignment3;

/**
 * Create a Rectangle, Circle, and Triangle class to implement that interface.
 * @author Daniel Wilson
 *
 */
public class Triangle implements Shape {
	// Private variables needed to calculate the area.
	private double height;
	private double base;

	// Parameterized Constructor accepts values that are assigned to the variables above
	Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	// Method overridden to calculate the area of a Triangle
	@Override
	public double calculateArea() {
		// Returns the result of the calculated area
		return (height*base)/2;
		
	}

	// Method overridden to display the results of the calculateArea method
	@Override
	public void display() {
		// Displays the results of the calculation
		System.out.printf("Triangle Area: " + "%.2f",calculateArea());
		
	}

}
