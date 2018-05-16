import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double USD = Double.parseDouble(scan.nextLine());
        double BGN = 1.79549 * USD;

        System.out.printf("%.2f BGN", BGN);
    }
}
