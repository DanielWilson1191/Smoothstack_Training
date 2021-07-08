/**
 * 
 */
package assignment3;

/**
 * Create a Rectangle, Circle, and Triangle class to implement that interface.
 * @author Daniel Wilson
 *
 */
public class Rectangle implements Shape {
	// Private variables needed to calculate the area.
	private double length;
	private double width;

	// Parameterized Constructor accepts values that are assigned to the variables above
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	// Method overridden to calculate the area of a Rectangle
	@Override
	public double calculateArea() {
		// Returns the result of the calculated area
		return width*length;
		
	}

	// Method overridden to display the results of the calculateArea method
	@Override
	public void display() {
		// Displays the results of the calculation
		System.out.printf("Rectangle Area: " + "%.2f",calculateArea());
		
	}

}
