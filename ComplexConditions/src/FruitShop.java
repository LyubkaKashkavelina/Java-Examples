import java.util.Scanner;

/**
 * Created by toshiba1 on 15.7.2017 г..
 */
public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine().toLowerCase();
        String day = scan.nextLine().toLowerCase();
        Double quantity = Double.parseDouble(scan.nextLine());
        Double price =  -1.0;

        if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday"))

        {
            if(fruit.equalsIgnoreCase("banana"))
            {
                price = quantity*2.50;
            }
            else if(fruit.equalsIgnoreCase("apple"))
            {
                price = quantity*1.20;
            }
            else if(fruit.equalsIgnoreCase("orange"))
            {
                price = quantity*0.85;
            }
            else if(fruit.equalsIgnoreCase("grapefruit"))
            {
                price = quantity*1.45;
            }
            else if(fruit.equalsIgnoreCase("kiwi"))
            {
                price = quantity*2.70;
            }
            else if(fruit.equalsIgnoreCase("pineapple"))
            {
                price = quantity*5.50;
            }
            else if(fruit.equalsIgnoreCase("grapes"))
            {
                price = quantity*3.85;
            }
            else {
                System.out.println("error");
            }
        }
        else if(day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday"))
        {
            if(fruit.equalsIgnoreCase("banana"))
            {
                price = quantity*2.70;
            }
            else if(fruit.equalsIgnoreCase("apple"))
            {
                price = quantity*1.25;
            }
            else if(fruit.equalsIgnoreCase("orange"))
            {
                price = quantity*0.90;
            }
            else if(fruit.equalsIgnoreCase("grapefruit"))
            {
                price = quantity*1.60;
            }
            else if(fruit.equalsIgnoreCase("kiwi"))
            {
                price = quantity*3.00;
            }
            else if(fruit.equalsIgnoreCase("pineapple"))
            {
                price = quantity*5.60;
            }
            else if(fruit.equalsIgnoreCase("grapes"))
            {
                price = quantity*4.20;
            }
            else {
                System.out.println("error");
            }
        }
        else
        {
            System.out.println("error");
        }
        System.out.printf("%.2f",price);
    }

}
