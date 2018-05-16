import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();


        if(budget<=100)
        {
            System.out.println("Economy class");
            if (season.equalsIgnoreCase("summer"))
            {
                System.out.printf("Cabrio - %.2f",budget*35/100);
            }
            else if(season.equalsIgnoreCase("winter"))
            {
                System.out.printf("Jeep - %.2f",budget*65/100);
            }

        }
        else if (budget>100&&budget<=500)
        {
            System.out.println("Compact class");
            if (season.equalsIgnoreCase("summer"))
            {
                System.out.printf("Cabrio - %.2f",budget*45/100);
            }
            else if(season.equalsIgnoreCase("winter"))
            {
                System.out.printf("Jeep - %.2f",budget*80/100);
            }
        }
        else if(budget>500)
        {
            System.out.println("Luxury class");
            System.out.printf("Jeep - %.2f",budget*90/100);
        }

    }
}
