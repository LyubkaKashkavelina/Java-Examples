import java.util.Scanner;

public class StopSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int height = 2*n+2;
        int weight = 4*n+3;


        System.out.printf("%s%s%s%n",repeatStr(".",n+1),repeatStr("_",2*n+1),repeatStr(".",n+1));


        for(int row = 1;row<=n;row++)
        {
            int numberOfDots = (2*n+2)-(2*row);
            System.out.printf("%s//%s\\\\%s%n",repeatStr(".",numberOfDots/2),
                    repeatStr("_",weight-numberOfDots-4),
                    repeatStr(".",numberOfDots/2));
        }
        System.out.printf("//%sSTOP!%s\\\\%n",repeatStr("_",(weight-9)/2),
                repeatStr("_",(weight-9)/2));

        System.out.printf("\\\\%s//%n",repeatStr("_",weight-4));

        for(int col = n;col>1;col--)
        {
            int numberOfDots = (2*n+2)-(2*col);
            System.out.printf("%s\\\\%s//%s%n",repeatStr(".",numberOfDots/2),
                    repeatStr("_",weight-numberOfDots-4),
                    repeatStr(".",numberOfDots/2));
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
