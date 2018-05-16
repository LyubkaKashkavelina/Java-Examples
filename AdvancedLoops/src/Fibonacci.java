import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int f0 = 1;
        int f1 = 1;

        if(n<2) {
            System.out.println("1");
        }
else {
            for (int i = 2; i <= n; i++) {

                int nextFib = f0 + f1;

                f0 = f1;
                f1 = nextFib;

            }
            System.out.println(f1);
        }
        }
}
