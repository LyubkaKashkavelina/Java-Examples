package filetasks.task01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OddLines {

	public static void read() {
		FileReader reader = null;
		try {
			reader = new FileReader("sample.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		BufferedReader br = new BufferedReader(reader);
		String s;
		int count = 1;
		try {
			while((s = br.readLine()) != null) {
				if (count % 2 != 0) {
					System.out.println(s);
				}
			 	
				count++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}				
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
	}
}
