import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.printf("%s%s%s%n",repeatStr("*",2*n),repeatStr(" ",n),
                repeatStr("*",2*n));
//        if(n%2==0)
//        {
//            System.out.printf("*%s*%s*%s*%n", repeatStr("/", 2 * n - 2), repeatStr("|", n),
//                    repeatStr("/", 2 * n - 2));
//        }


            for (int row = n - 2; row >= 1; row--) {
                if(n%2==0&&row==n/2){
                    System.out.printf("*%s*%s*%s*%n", repeatStr("/", 2 * n - 2), repeatStr("|", n),
                            repeatStr("/", 2 * n - 2));
                } else if(n%2==1&&row==n/2) {
                    System.out.printf("*%s*%s*%s*%n", repeatStr("/", 2 * n - 2), repeatStr("|", n),
                            repeatStr("/", 2 * n - 2));
                }else
                {
                    System.out.printf("*%s*%s*%s*%n", repeatStr("/", 2 * n - 2), repeatStr(" ", n),
                            repeatStr("/", 2 * n - 2));
                }

        }
        System.out.printf("%s%s%s%n",repeatStr("*",2*n),repeatStr(" ",n),
                repeatStr("*",2*n));
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}
