import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        boolean even = (num%2==0);
        if(even)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
