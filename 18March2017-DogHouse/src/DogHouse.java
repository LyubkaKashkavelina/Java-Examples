import java.util.Scanner;

public class DogHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double roof = 2*(length*length/2);
        double backSide = ((length/2) * (length/2)) + (length/2 * (width-(length/2))/2);
        double frontSide = backSide - length/5*length/5;
        double sides = 2*(length*length/2);

        double resultForRoof = roof/5;
        double resultForSides = (backSide+frontSide+sides)/3;

        System.out.printf("%.2f\n",resultForSides);
        System.out.printf("%.2f\n",resultForRoof);

    }
}
