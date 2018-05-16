import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int number =0;

        while (true)
        {try{
            System.out.print("Enter even number: ");
            number = Integer.parseInt(scan.nextLine());
            if(number%2==0)
            {
                break;
            }
            System.out.println("The number is not even!");
        }catch (Exception ex)
        {
            System.out.println("Invalid number.");
        }

        }
        System.out.println("Even number entered:" + number);

    }
}
