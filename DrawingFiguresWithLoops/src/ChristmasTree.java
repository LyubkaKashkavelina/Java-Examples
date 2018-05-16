import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0;i<=n;i++)
        {
            System.out.printf("%s%s | %s%n",repeatStr(" ",n-i),repeatStr("*",n-(n-i)),repeatStr("*",n-(n-i)));


        }
//        for(int j = 0;j<=n;j++)
//        {
//            System.out.printf(" %s%n",repeatStr("*",n-(n-j)));
//        }


    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}
