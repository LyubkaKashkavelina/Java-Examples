import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeOfYear = scan.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scan.nextLine());
        int weekendsInHometown = Integer.parseInt(scan.nextLine());
        double gamesInSofiaSaturday = 0.0;
        double gamesInSofiaHoliday = 0.0;
        double total = 0.0;

        if(typeOfYear.equalsIgnoreCase("normal"))
        {
            gamesInSofiaSaturday = (48-weekendsInHometown)*3.0/4;
            gamesInSofiaHoliday = holidays*2.0/3;
            total = gamesInSofiaSaturday + weekendsInHometown + gamesInSofiaHoliday;
//                if(typeOfYear.equalsIgnoreCase("leap"))
//                {
//                    double leapTotal = (0.15*total)+total;
//                    System.out.println(Math.floor(leapTotal));
//                }
//                else
//                {
                    System.out.println(Math.floor(total));
                //}

        }
        else if(typeOfYear.equalsIgnoreCase("leap"))
        {
            gamesInSofiaSaturday = (48-weekendsInHometown)*3.0/4;
            gamesInSofiaHoliday = holidays*2.0/3;
            total = gamesInSofiaSaturday + weekendsInHometown + gamesInSofiaHoliday;


                double leapTotal = (0.15*total)+total;
                System.out.println(Math.floor(leapTotal));


        }


    }


}

