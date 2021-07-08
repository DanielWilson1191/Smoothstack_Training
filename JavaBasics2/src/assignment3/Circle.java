/**
 * 
 */
package assignment3;

/**
 * Create a Rectangle, Circle, and Triangle class to implement that interface.
 * @author Daniel Wilson
 *
 */
public class Circle implements Shape {
	// Private variables needed to calculate the area.
	private double radius;

	// Parameterized Constructor accepts values that are assigned to the variables above
	Circle(double radius) {
		this.radius = radius;
	}
	
	// Method overridden to calculate the area of a Circle
	@Override
	public double calculateArea() {
		// Returns the result of the calculated area
		return Math.PI*Math.pow(radius, 2);
		
	}

	// Method overridden to display the results of the calculateArea method
	@Override
	public void display() {
		// Displays the results of the calculation
		System.out.printf("Circle Area: " + "%.2f",calculateArea());
		
	}
}
