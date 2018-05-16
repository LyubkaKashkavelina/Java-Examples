import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        if(season.equalsIgnoreCase("summer"))
        {
            if(budget<=100)
            {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f",budget*0.3);
            }
            else if(budget<=1000)
            {
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f",budget*0.4);
            }
            else if(budget>1000)
            {
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f",budget*0.9);
            }
        }
        else if(season.equalsIgnoreCase("winter"))
        {
            if(budget<=100)
            {
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f",budget*0.7);
            }
            else if(budget<=1000)
            {
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f",budget*0.8);
            }
            else if(budget>1000)
            {
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f",budget*0.9);
            }
        }
    }
}
