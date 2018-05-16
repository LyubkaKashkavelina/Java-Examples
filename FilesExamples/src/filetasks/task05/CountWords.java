package filetasks.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountWords {

	public static void doWork() {
		
		List<String> words = CountWords.getFileLines("words.txt");
		if (words == null) {
			return;
		}
		
		List<String> inputLines = CountWords.getFileLines("text.txt");
		if (inputLines == null) {
			return;
		}
		
		List<String> inputWords = new ArrayList<>();
		for (String line : inputLines) {
			String[] wordsInLine = line.split("[\\s,\\.;]");
			Collections.addAll(inputWords, wordsInLine);
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String inputWord : inputWords) {
			if (words.contains(inputWord)) {
				if (!map.containsKey(inputWord)) {
					map.put(inputWord, 1);
				}
				else {
					map.put(inputWord, map.get(inputWord) + 1);
				}					
			}
		}
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
        });
		
		HashMap<String, Integer> sortedHashMap = new HashMap<>();
		for (Map.Entry<String, Integer> entry : list) {           
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
		
		String resultFileName = "result.txt";
		FileWriter fileWriter = null;
		
		try {						
			fileWriter = new FileWriter(resultFileName);
			for (String word : sortedHashMap.keySet()) {
				fileWriter.write(String.format("%s %d\n", word, sortedHashMap.get(word)));
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
				if (fileWriter != null) {
					fileWriter.close();
				}				
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
	}

	private static List<String> getFileLines(String inputFileName) {
		FileReader fileReader = null;
		BufferedReader bf = null;
		List<String> result = new ArrayList<>();
		
		try {
			fileReader = new FileReader(inputFileName);
			bf = new BufferedReader(fileReader);
			String line;			
			while ((line = bf.readLine()) != null) {
				result.add(line);
			}
			
			return result;
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return null;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally {
			try {
				if (bf != null) {
					bf.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return null;
			}
		}
	}
}
