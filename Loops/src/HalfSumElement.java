import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumOfTheRest = 0;
        int sum = 0;
        int maxElement = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++) {
            int number = Integer.parseInt(scan.nextLine());

           if(number>maxElement)
           {
               maxElement = number;
           }
            sum = sum + number;
        }
       sumOfTheRest = sum - maxElement;

        if(sumOfTheRest==maxElement)
        {
            System.out.println("Yes, Sum = " + sumOfTheRest);
        }
        else
        {
            System.out.println("No, Diff = " + Math.abs(maxElement - sumOfTheRest));
        }

//
//
//
//
    }
}

