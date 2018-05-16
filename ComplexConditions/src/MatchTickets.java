import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine().toLowerCase();
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double left = 0.0;
        double priceNormal = 249.99;
        double priceVip = 499.99;

        if(numberOfPeople>=1&&numberOfPeople<=4)
        {
            if(category.equalsIgnoreCase("normal"))
            {
                left = budget-(budget*0.75);
                if(left>=priceNormal*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceNormal*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceNormal-left);
                }

            }
            else if(category.equalsIgnoreCase("vip"))
            {
                left = budget-(budget*0.75);
                if(left>=priceVip*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceVip*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceVip-left);
                }

            }
        }
        else if(numberOfPeople>=5&&numberOfPeople<=9)
        {
            if(category.equalsIgnoreCase("normal"))
            {
                left = budget-(budget*0.60);
                if(left>=priceNormal*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceNormal*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceNormal-left);
                }

            }
            else if(category.equalsIgnoreCase("vip"))
            {
                left = budget-(budget*0.60);
                if(left>=priceVip*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceVip*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceVip-left);
                }

            }
        }
        else if(numberOfPeople>=10&&numberOfPeople<=24)
        {
            if(category.equalsIgnoreCase("normal"))
            {
                left = budget-(budget*0.50);
                if(left>=priceNormal*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceNormal*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceNormal-left);
                }

            }
            else if(category.equalsIgnoreCase("vip"))
            {
                left = budget-(budget*0.50);
                if(left>=priceVip*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceVip*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceVip-left);
                }

            }
        }
        else if(numberOfPeople>=25&&numberOfPeople<=49)
        {
            if(category.equalsIgnoreCase("normal"))
            {
                left = budget-(budget*0.40);
                if(left>=priceNormal*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceNormal*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceNormal-left);
                }

            }
            else if(category.equalsIgnoreCase("vip"))
            {
                left = budget-(budget*0.40);
                if(left>=priceVip*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceVip*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceVip-left);
                }

            }
        }
        else if(numberOfPeople>=50)
        {
            if(category.equalsIgnoreCase("normal"))
            {
                left = budget-(budget*0.25);
                if(left>=priceNormal*numberOfPeople)
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceNormal*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceNormal-left);
                }

            }
            else if(category.equalsIgnoreCase("vip"))
            {
                left = budget-(budget*0.25);
                if(left>=(priceVip*numberOfPeople))
                {
                    System.out.printf("Yes! You have %.2f leva left.",left-priceVip*numberOfPeople);
                }
                else
                {
                    System.out.printf("Not enough money! You need %.2f leva.", numberOfPeople*priceVip-left);
                }

            }
        }
    }
}
