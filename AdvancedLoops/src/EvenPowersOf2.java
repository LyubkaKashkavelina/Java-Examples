import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//            System.out.print("n = ");
        int n = Integer.parseInt(scan.nextLine());
        int number = 1;
//            System.out.println("The numbers are:" );
        for(int i = 0;i<=n;i+=2)//i*=2
        {
            System.out.println(number);
            number = number * 4;
            //if(number%2==0)
            {
                //System.out.println(number);
            }
        }
    }
}
