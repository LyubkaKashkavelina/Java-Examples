package filetasks.task04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceInFile {

	public static void doWork() {
		String filename = "unfixed.sub";
		String resultFilename = "result-file.txt";
		
		FileReader fileReader = null;
		BufferedReader bf = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader(filename);
			bf = new BufferedReader(fileReader);
			String line;			
			fileWriter = new FileWriter(resultFilename);
			while ((line = bf.readLine()) != null) {
				fileWriter.write(line.replaceAll("\\sлюбов([\\s\\.])", " щастие$1")
					.replaceAll("\\sЛюбов([\\s\\.]*)", " Щастие$1")
					.replaceAll("\\sлюбовта([\\s\\.]*)", " щастието$1")
					.replaceAll("\\sЛюбовта([\\s\\.]*)", " Щастието$1"));
				
				fileWriter.write('\n');
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		finally {
			try {
				if (bf != null) {
					bf.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}
			
			try {
				if (fileWriter != null) {
					fileWriter.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
	}
}
