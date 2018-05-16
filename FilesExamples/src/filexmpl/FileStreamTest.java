package filexmpl;

import java.io.*;

public class FileStreamTest {

	public static void test() {
		try {								
			char[] bWrite = { '1', '2', '3' };
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write((int)bWrite[x]);// writes the bytes
			}

			os.close();

			InputStream is = new FileInputStream("test.txt");
			int size = is.available();

			for (int i = 0; i < size; i++) {
				System.out.print((char)is.read() + "  ");
			}
			
			is.close();
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}