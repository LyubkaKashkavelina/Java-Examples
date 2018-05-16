import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double b1 = Integer.parseInt(scan.nextLine());
        int b2 = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());

        double area = ((b1+b2)*h)/2;
        System.out.println("Trapezoid area = " + area);


    }
}
