/**
 * 
 */
package assignment3;

/**
 * Create a Shape Interface with the methods "calculateArea" and "display".
 * Create a Rectangle, Circle, and Triangle class to implement that interface.
 * 
 * This TestShapes class creates objects of all 3 shape classes, hard codes
 * the dimensions required for their respective constructors, and calls
 * the display method from each object.
 * 
 * @author Daniel Wilson
 *
 */
public class TestShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create all shapes with hard coded dimensions
		Rectangle rec = new Rectangle(8.5, 4.4);
		Circle circ = new Circle(91.5);
		Triangle tri = new Triangle(82, 57);
		
		/*
		 * Call the display method of each shape object
		 * This method calls the calculateArea method,
		 * which calculates the area of the respective shape,
		 * and displays the results.
		 */
		rec.display();
		System.out.println();
		circ.display();
		System.out.println();
		tri.display();		

	}

}
