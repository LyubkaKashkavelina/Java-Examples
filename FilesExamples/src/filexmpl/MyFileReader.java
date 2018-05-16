package filexmpl;

import java.io.*;
import java.util.Scanner;

public class MyFileReader {

	public static void read() throws FileNotFoundException {
		/*
		 * // Link the File variable to a file on the computer File file = new
		 * File("sample.txt"); // Next line may throw an exception! Scanner fileReader =
		 * new Scanner(file); int lineNumber = 0; // Read file while
		 * (fileReader.hasNextLine()) { lineNumber++; System.out.printf("Line %d: %s%n",
		 * lineNumber, fileReader.nextLine()); } // Close the resource after you've
		 * finished using it fileReader.close();
		 */

		String fileName = "sample.txt";
		Scanner fileReader = null;
		int lineNumber = 0;
		try {
			fileReader = new Scanner(new File(fileName));
			System.out.println("File " + fileName + " opened.");
			while (fileReader.hasNextLine()) {
				lineNumber++;
				System.out.printf("Line %d:%s%n", lineNumber, fileReader.nextLine());
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + fileName + " not found.");
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.");
		}
	}
}