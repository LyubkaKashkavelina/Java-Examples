import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();

        if(figure.equalsIgnoreCase("square"))
        {
            double sideSquare = Double.parseDouble(scan.nextLine());
            double areaSquare = sideSquare*sideSquare;
            System.out.printf("%.3f", areaSquare);
        }
        else if(figure.equalsIgnoreCase("rectangle"))
        {
            double sideRect1 = Double.parseDouble(scan.nextLine());
            double sideRect2 = Double.parseDouble(scan.nextLine());
            double areaRect = sideRect1*sideRect2;
            System.out.printf("%.3f", areaRect);
        }
        else if(figure.equalsIgnoreCase("circle"))
        {
            double radius = Double.parseDouble(scan.nextLine());
            double areaCircle = Math.PI*radius*radius;
            System.out.printf("%.3f", areaCircle);
        }
        else if(figure.equalsIgnoreCase("triangle"))
        {
            double sideTriangle = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            double areaTriangle = sideTriangle*height/2;
            System.out.printf("%.3f", areaTriangle);
        }

    }
}
