import java.util.Scanner;

public class AreaOfRectangleByCoordinates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2= Double.parseDouble(scan.nextLine());

        double side1 = Math.abs(x1-x2);
        double side2 = Math.abs(y1-y2);

        double area = side1*side2;
        double perimeter = 2*(side1 + side2);

        System.out.println(area);
        System.out.println(perimeter);

    }
}
