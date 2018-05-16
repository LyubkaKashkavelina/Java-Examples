

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        try{
            String currentLine;

            br = new BufferedReader(new FileReader("newfile.txt"));

            while ((currentLine=br.readLine())!=null)
            {
                System.out.println(currentLine);
            }
        }catch (IOException e)
        {
            System.out.println("Exception");
            e.printStackTrace();
        }
        finally {
            try{
                if(br!=null)
                {
                    br.close();
                }

            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
