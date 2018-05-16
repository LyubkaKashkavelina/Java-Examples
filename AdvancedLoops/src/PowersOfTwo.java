import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//            System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());
        int number = 0;
//            System.out.println("The numbers are:" );
        for(int i = 0;i<=n;i++)//i*=2
        {

            System.out.println((int)Math.pow(2,i));
        }
    }
}
