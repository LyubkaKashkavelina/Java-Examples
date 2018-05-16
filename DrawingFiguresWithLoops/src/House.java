import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

       if(n%2==0)
       {
          for(int row = 1;row<n/2;row++)
         {
             System.out.printf("%s%s%s%n",repeatStr("-",(n-(row*2))/2),
                     repeatStr("*",row*2),repeatStr("-",(n-(row*2))/2));
         }
           System.out.printf("%s%n",repeatStr("*",n));
           for(int col = 0;col<n/2;col++)
           {
               System.out.printf("|%s|%n",repeatStr("*",n-2));

           }
       }
       else
       {
           for(int row = 0;row<n/2;row++)

           {
               if(row==0)
               {
                   System.out.printf("%s%s%s%n", repeatStr("-",(n-(row+1))/2),
                           repeatStr("*", row+1),
                           repeatStr("-",(n-(row+1))/2));
               }
               else {
                   System.out.printf("%s%s%s%n", repeatStr("-", (n - (2*row + 1)) / 2),
                           repeatStr("*", 2*row + 1),
                           repeatStr("-", (n - (2*row + 1)) / 2));
               }
           }
           System.out.printf("%s%n",repeatStr("*",n));
           for(int col = 0;col<n/2;col++)
           {
               System.out.printf("|%s|%n",repeatStr("*",n-2));

           }
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
