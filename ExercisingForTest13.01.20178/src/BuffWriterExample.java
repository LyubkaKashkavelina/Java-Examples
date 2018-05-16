import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class BuffWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter buffWriter = null;
       // FileWriter fileWriter = null;

        try{
            String textToBeWritten = "Some text ... with more stuff";
            File file = new File("someNewFile.txt");
           // fileWriter = new FileWriter(file.getAbsoluteFile());
            buffWriter = new BufferedWriter(new FileWriter("someNewFile.txt"));

            buffWriter.write(textToBeWritten);
            buffWriter.flush();
            System.out.println("Ready!");


        }catch (IOException e)
        {
            e.printStackTrace();
        }finally {
            if(buffWriter!=null) {
                try {

                    buffWriter.close();
                }catch (IOException e)
                {
                    e.printStackTrace();
                }
            }


        }



                HashMap<String, String> dictionary = new HashMap<>();
                dictionary.put("programming", "food + coffee -> software");
                dictionary.put("Java", "OOP Language");
                dictionary.put("Python", "foo");
                dictionary.put("Python", "scripting language");
                String key = "Python";
                System.out.println("The word " + key + " means " + dictionary.get(key));

        }
    }
