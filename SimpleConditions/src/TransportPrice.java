import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfKilometers = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        double price = 0;

        if(numberOfKilometers>=1&&numberOfKilometers<=5000)
        {
            if(numberOfKilometers<=19)
            {
                if(time.equalsIgnoreCase("day"))
                {
                    price = 0.70 + numberOfKilometers*0.79;
                    System.out.println(price);
                }
                else if(time.equalsIgnoreCase("night"))
                {
                    price = 0.70 + numberOfKilometers*0.90;
                    System.out.println(price);
                }
            }
            else if(numberOfKilometers>=20&&numberOfKilometers<=99)
            {
                if(time.equalsIgnoreCase("day")||time.equalsIgnoreCase("night"))
                {
                    price = numberOfKilometers*0.09;
                    System.out.println(price);
                }
            }
            else if(numberOfKilometers>=100&&numberOfKilometers<=5000)
            {
               // if(time.equalsIgnoreCase("day"))
               // {
                    price = numberOfKilometers*0.06;
                    System.out.println(price);
                //}
                //else if(time.equalsIgnoreCase("night"))
//                //{
//                    price = numberOfKilometers*0.06;
//                    System.out.printf("%.1f",price);
//                }
            }



        }
        else
        {
            System.out.println("invalid kilometres");
        }
    }
}
