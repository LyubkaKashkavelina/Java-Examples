package filexmpl;

import java.io.*;

public class StoreNumbers {

	public static void store() throws FileNotFoundException {
		// Create a PrintStream instance
		PrintStream fileWriter;
		try {
			fileWriter = new PrintStream("numbers.txt", "utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// Loop through the numbers from 1 to 20 and write them
		for (int num = 1; num <= 20; num++) {
			fileWriter.println(num);
		}
		// Close the stream when you are done using it
		fileWriter.close();
	}
}