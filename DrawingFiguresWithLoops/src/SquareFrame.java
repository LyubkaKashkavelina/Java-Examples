import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int numberOfMinus = n-2;

        System.out.printf("+ %s+\n",repeatStr("- ", n-2));

        for(int i = 1;i<=n-2;i++)
        {
            System.out.printf("| %s|",repeatStr("- ", n-2));
            System.out.println();
        }
        System.out.printf("+ %s+\n",repeatStr("- ", n-2));
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}
