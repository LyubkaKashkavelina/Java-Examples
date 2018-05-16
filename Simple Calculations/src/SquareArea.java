import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter lenght of a square's side:");
        double a = Double.parseDouble(scan.nextLine());


        double area;
        area = a*a;
        System.out.println("The area of the square is:" + area);



    }
}
