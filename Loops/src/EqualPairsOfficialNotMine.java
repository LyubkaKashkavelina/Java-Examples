import java.util.Scanner;

public class EqualPairsOfficialNotMine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
//        int nachalnaSuma = 0;

        long prevSum = 0;
        long maxDiff = Integer.MIN_VALUE;

        for(int i = 0;i<count;i++)
        {
            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            long currentSum = number1+number2;

            if(i!=0)
            {
                if(prevSum!=currentSum)
                {
                    long currentDiff = Math.abs(currentSum-prevSum);
                    if(currentDiff>maxDiff)
                    {
                        maxDiff=currentDiff;
                    }
                }
            }
            prevSum=currentSum;



        }
        if(maxDiff==Integer.MIN_VALUE)
        {
            System.out.println("Yes, value = "+ prevSum);
        }
        else
        {
            System.out.println("No, maxdiff = " + maxDiff);
        }

    }
}
