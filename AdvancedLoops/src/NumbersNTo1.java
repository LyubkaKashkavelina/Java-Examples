import java.util.Scanner;

public class NumbersNTo1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//            System.out.print("n = ");
            int n = Integer.parseInt(scan.nextLine());
//            System.out.println("The numbers are:" );
            for(int i = n;i>=1;i--)
            {

                System.out.println(i);
            }
        }


}
