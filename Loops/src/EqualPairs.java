import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int nachalnaSuma = 0;
        int currDiff;
        int prevSum = 0;
        double maxDiff = -1000000000.0;

        for(int i = 0;i<n;i++)
        {
            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            if(i==0)
            {
               nachalnaSuma = nachalnaSuma + number1 + number2;
            }
            else
            {
                prevSum = number1 + number2;
                currDiff =Math.abs(prevSum - nachalnaSuma);
                if(currDiff>maxDiff)
                {
                    maxDiff=currDiff;
                }


            }




        }
        if(nachalnaSuma==prevSum)
        {
            System.out.println("Yes, value = "+nachalnaSuma);
        }
        else
        {
           if(prevSum==0) {

               System.out.println("Yes, value = " + nachalnaSuma);
           }
           else
            {
                System.out.println("No, maxdiff = " + Math.abs(maxDiff));
            }

        }
    }
}
