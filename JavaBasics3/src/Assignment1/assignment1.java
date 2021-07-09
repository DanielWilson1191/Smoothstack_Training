/**
 * 
 */
package Assignment1;

import java.io.File;

/**
 * Java Basics 3 - Assignment 1
 * Write a Java program to get a list of all file/directory names
 * (including in subdirectories) under a given directory.
 * 
 * @author Daniel Wilson
 *
 */
public class assignment1 {

	/**
	 * Program selects a specific file directory and creates a File array from the
	 * files listed in the given directory. This list is then iterated through and
	 * determines whether the element is a file or another directory. If the element
	 * is a directory it's name is displayed and another array is created. The new
	 * array is iterated through and displays the elements in the new directory and
	 * displays their names. Otherwise, if the element is a file, the file name is
	 * displayed.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Calls the method to display file and directory names of given directory path
		displayFileAndDirNames("C:\\Users");
	}

	// Method accepts a file path and displays the names of files and directories
	// Search through given directory only goes one level deeper into directories
	// found in initial directory.
	public static void displayFileAndDirNames(String origin) {
		try {
			// Original File is selected as the 1st directory to search through
			File directory = new File(origin);

			// File array is created from the listFiles method called by the given directory
			File[] fileList = directory.listFiles();
			
			if(fileList.length < 1) {
				System.out.println("Given Directory Is Empty!");
			}

			// File array is iterated through to find files and folders and display their names
			for (File files : fileList) {
				if (files.isFile() || files.isDirectory()) {
					System.out.println(files.getName());

					// Folders found will generate a new File array
					if (files.isDirectory()) {
						try {
							File secondaryDir = new File(files.getAbsolutePath());
							File[] secondFileList = secondaryDir.listFiles();

							// New File array is iterated through and only displays the file and folder names
							// Only goes one level deep into directories and moves on
							for (File files2 : secondFileList) {
								if (files2.isFile() || files2.isDirectory()) {
									System.out.println("\t" + files2.getName()); // Slight formatting of display for readability
								}
							}
						} catch (Exception e) {
							// e.printStackTrace();
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Directory Path Given!");
		}
	}

}
