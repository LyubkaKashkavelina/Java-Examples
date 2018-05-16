import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0;i<n;i++)
        {
            //System.out.println("*");
            for(int c = 0;c<n;c++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
