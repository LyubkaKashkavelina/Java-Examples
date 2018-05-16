import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        boolean isPrime = true;
        int divider = 2;
            if(number<2){

                isPrime = false;
            }
            else
            {
                while (true)
                {
                    if(number%divider==0)
                    {
                        isPrime = false;
                        break;
                    }
                    divider++;
                    if(divider==number)
                    {
                        break;
                    }


                }
            }
            if(isPrime)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }

    }
}
