import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int row = 1;row<=n;row++)
        {
            System.out.printf("%s*%s",repeatStr(" ",n-row),repeatStr(" *",row-1));
            System.out.println();
            //System.out.println("*");
            //System.out.printf("%s",repeatStr("*",row-n));
        }

        for(int col = n-1;col>=1;col--)
        {
            System.out.printf("%s*%s",repeatStr(" ",n-col),repeatStr(" *",col-1));
            System.out.println();
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}
