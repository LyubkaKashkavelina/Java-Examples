import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int number;
        int sum = 0;

        for(int i = 0;i<s.length();i++)
        {
           switch (s.charAt(i))
           {
               case 'a': number = 1;break;
               case 'e': number = 2;break;
               case 'i': number = 3;break;
               case 'o': number = 4;break;
               case 'u': number = 5;break;
               default: number =0;break;
           }
           sum += number;
        }
        System.out.println(sum);

    }
}
