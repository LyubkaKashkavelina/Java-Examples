import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int count = 0;
        for (int i = firstNumber; i <=secondNumber; i++) {

            for (int j = firstNumber;j<=secondNumber;j++)
            {
                count++;
                if(i + j == magicNumber)
                {
                    System.out.printf("Combination N:%s (%s + %s = %s)",count,i,j,magicNumber);
                    //System.out.printf("(%s + %s = %s)",i,j,magicNumber);
                    return;

                }
            }



        }
        System.out.printf("%d combinations - neither equals %d",count,magicNumber);


    }
}
