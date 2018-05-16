import java.util.Scanner;

/**
 * Created by toshiba1 on 7.7.2017 г..
 */
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String base = repeatChar(n, '*');
        System.out.println(base);

        String mid = repeatChar(n-2,' ') ;
        for(int i = 0; i< n-2; i++)
        {
            System.out.printf("*%s*\n",mid);
        }

        System.out.println(base);
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
