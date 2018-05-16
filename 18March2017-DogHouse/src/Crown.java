import java.util.Scanner;

public class Crown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        int width = (2*N)-1;
        int height = (N/2)+4;


        System.out.printf("@%s@%s@\n",repeatStr(" ",N-2),repeatStr(" ",N-2));
        System.out.printf("**%s*%s**\n",repeatStr(" ",(width-5)/2),repeatStr(" ",(width-5)/2));

        for(int i = 1;i<=height-6;i++)
        {
            System.out.printf("*%s*%s*%s*%s*%s*\n",repeatStr(".",i),
                    repeatStr(" ",((2*N)-4*i-6)/2),repeatStr(".",2*i-1),
                    repeatStr(" ",((2*N)-4*i-6)/2),repeatStr(".",i));
        }

        System.out.printf("*%s*%s*%s*\n",repeatStr(".",N/2-1),repeatStr(".",width-4-2*(N/2-1)),repeatStr(".",N/2-1));

        System.out.printf("*%s%s.%s%s*\n",repeatStr(".",N/2),repeatStr("*",(N-4)/2),
                repeatStr("*",(N-4)/2),repeatStr(".",N/2));


        System.out.printf("%s\n",repeatStr("*",width));
        System.out.printf("%s",repeatStr("*",width));


    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}
