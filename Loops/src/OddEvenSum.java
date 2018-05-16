import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0;i<n;i++)
        {
            int number = Integer.parseInt(scan.nextLine());
            if(i%2==0)
            {
                evenSum = evenSum+number;
            }
            else
            {
                oddSum = oddSum + number;
            }

        }
        if(evenSum==oddSum)
        {
            System.out.println("Yes Sum = "+evenSum);
        }
        else {
            System.out.println("No Diff = "+Math.abs(evenSum-oddSum));
        }
    }
}
