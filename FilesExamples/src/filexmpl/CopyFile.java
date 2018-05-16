package filexmpl;

import java.io.*;

public class CopyFile {

	public static void copyBinary(String filename1, String filename2) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(filename1);
			out = new FileOutputStream(filename2);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();  
			}
		}
	}
	
	public static void copyText(String filename1, String filename2) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader(filename1);
			out = new FileWriter(filename2);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();  
			}
		}
	}
}