import java.util.Scanner;

public class NumberInRange1To100 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number int the range [1...100]:");
        int n = Integer.parseInt(scan.nextLine());

        while(n<=0||n>100)
        {
            System.out.println("Invalid number!");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.println("The number is: "+n);

    }
}
