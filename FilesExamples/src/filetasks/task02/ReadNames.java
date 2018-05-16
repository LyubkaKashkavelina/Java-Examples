package filetasks.task02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ReadNames {

	public static void doWork() {
		
		String[] names = getNames("names.txt");
		if (names == null) {
			return;
		}
		
		Arrays.sort(names);
	
		writeNames("names-sorted.txt", names);
	}

	private static void writeNames(String filename, String[] names) {
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(filename);
			for (String name : names) {
				writer.write(name);
				writer.write('\n');
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
	}

	private static String[] getNames(String filename) {
		
		String[] names = null;
		
		FileReader reader = null;
		
		try {
			reader = new FileReader(filename);
		}
		catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			return names;
		}
		
		BufferedReader bf = new BufferedReader(reader);
		int namesCount = 0;
		try {
			namesCount = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return names;
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			return names;
		}
		
		names = new String[namesCount];
		int i = 0;
		String line;
		try {
			while ((line = bf.readLine()) != null) {
				names[i] = line;
				i++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return names;
		}
		finally {
			try {
				if (bf != null) {
					bf.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return names;
			}
		}
		
		return names;
	}
}