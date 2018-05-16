import java.util.Scanner;

public class GreraterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());



        if(firstNumber>secondNumber)
        {
            System.out.println("Greater number: " + firstNumber);
        }

        else
        {
            System.out.println("Greater number: " + secondNumber);
        }
    }
}
