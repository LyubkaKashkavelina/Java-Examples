import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if(n%2==0)
        {


            for(int row = 1;row<=n/2-1;row++)
            {
                System.out.printf("%s*%s*%s%n",repeatStr("-",(n-2-(row*2-2))/2),
                            repeatStr("-",row*2-2),
                            repeatStr("-",(n-2-(row*2-2))/2));

            }

            System.out.printf("*%s*%n",repeatStr("-",n-2));


            for(int col = n/2-1;col>=1;col--)
            {
                System.out.printf("%s*%s*%s%n",repeatStr("-",(n-2-(col*2-2))/2),
                        repeatStr("-",col*2-2),
                        repeatStr("-",(n-2-(col*2-2))/2));

            }

        }
        else  if(n==1)
        {
            System.out.println("*");
        }

        else
        {
            System.out.printf("%s*%s%n",repeatStr("-",(n-1)/2),repeatStr("-",(n-1)/2));

            for(int row = 0;row<n/2-1;row++)
            {
                System.out.printf("%s*%s*%s%n",repeatStr("-",(n-2-(row*2+1))/2),
                        repeatStr("-",row*2+1),
                        repeatStr("-",(n-2-(row*2+1))/2));

            }

            //System.out.printf("*%s*%n",repeatStr("-",n-2));


            for(int col = n/2-1;col>=0;col--)
            {
                System.out.printf("%s*%s*%s%n",repeatStr("-",(n-2-(col*2+1))/2),
                        repeatStr("-",col*2+1),
                        repeatStr("-",(n-2-(col*2+1))/2));

            }
            System.out.printf("%s*%s%n",repeatStr("-",(n-1)/2),repeatStr("-",(n-1)/2));

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
