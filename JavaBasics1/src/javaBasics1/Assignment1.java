package javaBasics1;

/*
 * Daniel Wilson
 * Assignment 1
 * Generate 4 patterns as shown
 1)
*
**
***
****
.........
2)
..........
****
***
**
*
3)
     *
    ***
   *****
  *******
...........
4)
............
  *******
   *****
    ***
     *
 */

public class Assignment1 {

	public static void main(String[] args) {
		// Initialize variables to allow them to be in scope until end of program
		int rowMax = 5, dotMax = 9;
		
		dotMax = pattern1And2(rowMax, dotMax);
		System.out.println("3)");
		pattern3And4(rowMax, dotMax);

	}
	
	// pattern1And2 method generates the first 2 patterns as requested
	public static int pattern1And2(int rowMax, int dotMax) {
		// Generate pattern 1
		System.out.println("1)");
		for(int index = 0; index < rowMax; index++) {
			// Determine where the row of dots should be and print the appropriate number of dots
			if(index == rowMax-1) {
				for (int index2 = 0; index2 < dotMax; index2++) {
					System.out.print('.');					
				}
			}
			// Otherwise, print the incrementing number of asterisks
			else {
				for (int index3 = 0; index3 <= index; index3++) {
					System.out.print('*');					
				}
				System.out.println();
			}
		}
		
		dotMax++;	// Increment the number of dots for the next pattern.
		
		// Generate pattern 2
		System.out.println("\n2)");
		for(int index = rowMax-1; index >= 0; index--) {
			// Determine where the row of dots should be and print the appropriate number of dots
			if(index == rowMax-1) {
				for (int index2 = 0; index2 < dotMax; index2++) {
					System.out.print('.');					
				}
				System.out.println();
			}
			// Otherwise, print the decrementing number of asterisks
			else {
				for (int index3 = 0; index3 <= index; index3++) {
					System.out.print('*');					
				}
				System.out.println();
			}
		}
		
		dotMax++;	// Increment the number of dots for the next pattern.
		
		return dotMax;	// Return the new number of dots to be generated in the next pattern
	}
	
	// pattern3And4 method generates the last 2 patterns as requested
	public static void pattern3And4(int rowMax, int dotMax) {
		int start = (dotMax/2);	// Determine the starting point for the asterisks to be printed
		int end = start;	// Determines where the last asterisk of the row should be printed
		
		// Generate pattern 3
		for (int index = 0; index < rowMax; index++) {
			// Determine where the row of dots should be and print the appropriate number of dots
			if(index == rowMax-1) {
				for (int index2 = 0; index2 < dotMax; index2++) {
					System.out.print('.');					
				}
			}
			// Otherwise, print the appropriate number of asterisks in the center (incremented by 2 per row)
			else {
				for (int index3 = 0; index3 <= end; index3++) {
					if(index3 >= start) {
						System.out.print('*');						
					}
					else {
						System.out.print(' ');	// Generate spaces where asterisks should not be
					}
				}
					start--;	// Moves the starting point of the asterisks back 1 place
					end++;		// Moves the ending point of the asterisks forward 1 place
					System.out.println();				
			}
		}
		
		dotMax++;	// Increment the number of dots for the next pattern.
		
		// Reset the starting and ending positions as the previous decrements and increments were extra
		start++;
		end--;
		
		// Generate pattern 4
		System.out.println("\n4)");
		for (int index = rowMax-1; index >= 0; index--) {
			// Determine where the row of dots should be and print the appropriate number of dots
			if(index == rowMax-1) {
				for (int index2 = 0; index2 < dotMax; index2++) {
					System.out.print('.');					
				}
				System.out.println();
			}
			// Otherwise, print the appropriate number of asterisks in the center (decremented by 2 per row)
			else {
				for (int index3 = 0; index3 <= end; index3++) {
					if(index3 >= start) {
						System.out.print('*');						
					}
					else {
						System.out.print(' ');	// Generate spaces where asterisks should not be
					}
				}
					start++;	// Moves the starting point of the asterisks forward 1 place
					end--;		// Moves the ending point of the asterisks back 1 place
					System.out.println();
			}
		}
	}

}

