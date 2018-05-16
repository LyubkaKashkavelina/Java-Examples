package filexmpl;

import java.io.*;

public class ReadDir {

	public static void read() {
		File file = null;
		String[] paths;

		try {
			// create new file object
			file = new File("C:\\tmp");

			if (!file.canRead()) {
				System.out.println("Directory C:\\tmp cannot be read.");
				return;
			}
			
			// array of files and directory
			paths = file.list();
			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
			}
		} catch (Exception e) {
			// if any error occurs
			System.out.println(e.getMessage());
		}
	}
}