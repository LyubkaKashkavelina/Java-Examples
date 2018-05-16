package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationHelper {

	public static void serialize(Person person, String filename) {
		try {
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in " + filename);
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public static Person deserialize(String filename) {
		Person person = null;
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			person = (Person) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			System.out.println(i.getMessage());
		} catch (ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
		
		return person;
	}
}