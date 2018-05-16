import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        if(firstNumber==secondNumber)
        {
            if(secondNumber==thirdNumber)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }

        }
        else
        {
            System.out.println("no");
        }


    }
}
