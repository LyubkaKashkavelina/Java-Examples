import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int count = Integer.parseInt(scan.nextLine());
        double evenSum = 0.0;
        double oddSum = 0.0;
        double maxEven = -1000000000.0;
        double minEven = 1000000000.0;
        double maxOdd = -1000000000.0;
        double minOdd = 1000000000.0;


        for(int i = 1;i<=count;i++)
        {
            double number = Double.parseDouble(scan.nextLine());

            if(i%2==0)
            {
                evenSum = evenSum+number;
                //System.out.println(evenSum);
                if(number>maxEven)
                {
                    maxEven = number;
                   // System.out.println(maxEven);
                }
                if(number<minEven)
                {
                    minEven = number;
                    //System.out.println(minEven);
                }
            }
            else
            {
                oddSum = oddSum + number;
                //System.out.println(oddSum);
                if(number>maxOdd)
                {
                    maxOdd = number;
                   //System.out.println(maxOdd);
                }
                 if(number<minOdd)
                {
                    minOdd = number;
                   // System.out.println(minEven);
                }
            }
        }


        if(minOdd==1000000000.0)
        {   System.out.println("Oddsum="+df.format(oddSum));
            System.out.println("Oddmin = No");
        }
        else
        {
            System.out.println("Oddsum="+df.format(oddSum));
            System.out.println("Oddmin="+df.format(minOdd));
        }

        if(maxOdd==-1000000000.0)
        {
            System.out.println("Oddmax = No");
        }
        else
        {
            System.out.println("Oddmax="+df.format(maxOdd));
        }


        if(minEven==1000000000.0)
        {   System.out.println("Evensum="+df.format(evenSum));
            System.out.println("Evenmin = No");
        }
        else {
            System.out.println("Evensum="+df.format(evenSum));

            System.out.println("Evenmin="+df.format(minEven));
        }
        if(maxEven==-1000000000.0)
        {
            System.out.println("Evenmax = No");
        }
        else {
            System.out.println("Evenmax="+df.format(maxEven));
        }
    }
}
