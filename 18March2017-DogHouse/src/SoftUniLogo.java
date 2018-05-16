import java.util.Scanner;

public class SoftUniLogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        int height = 4*n-2;
        int width = 12*n-5;

        System.out.printf("%s#%s\n",repeatStr(".",(width-1)/2),repeatStr(".",(width-1)/2));
        //System.out.printf("%s%s%s\n",repeatStr(".",(width-7)/2),repeatStr("#",7),repeatStr(".",(width-7)/2));
        for(int i = 1;i<=2*n-2;i++)
        {
            if(i==1)
            {
                System.out.printf("%s%s#%s\n", repeatStr(".", (width - (7 * i - i)) / 2), repeatStr("#", 7 * i - i), repeatStr(".", (width - (7 * i - i)) / 2));

            }
            else {
                System.out.printf("%s%s%s\n", repeatStr(".", (width - ((7 * i - i)+1)) / 2), repeatStr("#", (7 * i - i)+1), repeatStr(".", (width - ((7 * i - i)+1)) / 2));
            }
        }


        System.out.printf("%s\n",repeatStr("#",width));
        for (int k = 1;k<=n-2;k++)
        {
            System.out.printf("|%s%s%s\n",repeatStr(".",3*k-1),repeatStr("#",width-2*3*k),
                    repeatStr(".",3*k));
        }

        for (int j = 1;j<n;j++)
        {
            System.out.printf("|%s%s%s\n",repeatStr(".",((width-(6*n+1))/2)-1 ),repeatStr("#",6*n+1),
                    repeatStr(".",(width-(6*n+1))/2));
        }
        System.out.printf("@%s%s%s\n",repeatStr(".",((width-(6*n+1))/2)-1 ),repeatStr("#",6*n+1),
                repeatStr(".",(width-(6*n+1))/2));




    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}
