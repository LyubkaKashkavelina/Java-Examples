package filemain;

import java.io.IOException;
import filexmpl.*;
import serialization.*;
import filetasks.task01.OddLines;
import filetasks.task02.ReadNames;
import filetasks.task03.ReadMatrix;
import filetasks.task04.ReplaceInFile;
import filetasks.task05.CountWords;

public class MainApp {

	public static void main(String[] args) {
		try {			
			/* These are files examples from the presentation */
			CopyFile.copyBinary("input.txt", "output.txt");
			System.out.println();
			CopyFile.copyText("input.txt", "output-2.txt");
			System.out.println();
			ReadConsole.read();
			System.out.println();
			FileStreamTest.test();
			System.out.println();
			CreateDir.create();
			System.out.println();
			ReadDir.read();
			System.out.println();
			MyFileReader.read();
			System.out.println();
			StoreNumbers.store();
			System.out.println();
			CountOccurences.count("line");
			System.out.println();
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
			return;
		}
		
		/* These are files tasks/assignments (at the end of the presentation). */
		System.out.println();
		OddLines.read();
		System.out.println();
		ReadNames.doWork();
		System.out.println();
		ReadMatrix.doWork();
		System.out.println();
		ReplaceInFile.doWork();
		System.out.println();
		CountWords.doWork();
		System.out.println();
		
		/* This is a serialization example. */
		Person person = new Person();
		person.name = "Ivan";
		person.email = "ivan@example.com";
		person.gender = 0;
		person.age = 20;
		
		SerializationHelper.serialize(person, "person.ser");
		Person person2 = SerializationHelper.deserialize("person.ser");
		System.out.println();
		person2.checkMail();
	}
}