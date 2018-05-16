import java.util.Scanner;

/**
 * Created by toshiba1 on 7.7.2017 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Enter b");
        int b = Integer.parseInt(scan.nextLine());

        int area = a * b;
        System.out.println(area);
    }
}