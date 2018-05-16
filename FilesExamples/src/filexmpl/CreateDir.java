package filexmpl;

import java.io.*;

public class CreateDir {
	
	public static void create() {
		String dirname = "C:\\tmp\\user\\java\\bin2";
		File d = new File(dirname);
	      
	      // Create directory now.
	    d.mkdirs();
	}
}