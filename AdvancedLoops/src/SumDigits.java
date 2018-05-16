import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lastDigit;
        int sumOfLastDigit = 0;
        int correctNumber = 0;

        int number = Integer.parseInt(scan.nextLine());

        do {
            lastDigit= number%10;
            sumOfLastDigit = sumOfLastDigit + lastDigit;

            number = number/10;

        }
            while (number!=0);
        System.out.println(sumOfLastDigit);

    }
}
