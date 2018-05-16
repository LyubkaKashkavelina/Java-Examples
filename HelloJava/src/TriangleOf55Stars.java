/**
 * Created by toshiba1 on 7.7.2017 г..
 */
public class TriangleOf55Stars {
    public static void main(String[] args) {
        for (int i=1; i<=10;i++){
           String line = repeatChar(i, '*');
         System.out.println(line);
        }
    }
    private static String repeatChar(int count, char symbol)
    {
        String result = "";
        for (int i = 0;i<count;i++)
        {
            result += symbol;
        }
        return result;
    }

}

