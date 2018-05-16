import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine().toLowerCase();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double funds = 0;



            if(projection.equalsIgnoreCase("premiere"))
            {
                funds=rows*columns*12.00;
            }
            else  if(projection.equalsIgnoreCase("normal"))
            {
                funds=rows*columns*7.50;
            }
            else  if(projection.equalsIgnoreCase("discount"))
            {
                funds=rows*columns*5.00;
            }
        System.out.printf("%.2f leva",funds);

    }
    }

