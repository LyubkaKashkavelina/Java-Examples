import java.util.Scanner;

public class DrawFort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int midSum = n*2-4-2*(n/2);

        if(n==3||n==4)
        {
            System.out.printf("/%s\\/%s\\ ",repeatStr("^",n/2),repeatStr("^",n/2));
            System.out.println();
            for(int i = 1;i<=n-2;i++)

            {
                System.out.printf("|%s|%n",repeatStr(" ",n*2-2));
            }
            System.out.printf("\\%s/\\%s/",repeatStr("_",n/2),repeatStr("_",n/2));

        }

        else {


            System.out.printf("/%s\\%s/%s\\ ", repeatStr("^", n / 2), repeatStr("_", midSum), repeatStr("^", n / 2));
            System.out.println();
            for (int i = 0; i < n - 3; i++)

            {
                System.out.printf("|%s|%n", repeatStr(" ", n * 2 - 2));
            }
            System.out.printf("|%s%s%s|%n", repeatStr(" ", n / 2 + 1), repeatStr("_", midSum),
                    repeatStr(" ", n / 2 + 1));
            System.out.printf("\\%s/%s\\%s/", repeatStr("_", n / 2),
                    repeatStr(" ", midSum), repeatStr("_", n / 2));


        }

//        for(int i = 1;i<=n;i++)
//        {
//
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
