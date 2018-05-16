import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String product = scan.nextLine().toLowerCase();
        String town = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;

        if(town.equalsIgnoreCase("Sofia"))
        {
            if(product.equalsIgnoreCase("coffee"))
            {
                price = 0.50 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("water"))
            {
                price = 0.80 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("beer"))
            {
                price = 1.20 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("sweets"))
            {
                price = 1.45 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("peanuts"))
            {
                price = 1.60 * quantity;
                System.out.println(price);
            }
        }
        if(town.equalsIgnoreCase("varna"))
        {
            if(product.equalsIgnoreCase("coffee"))
            {
                price = 0.45 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("water"))
            {
                price = 0.70 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("beer"))
            {
                price = 1.10 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("sweets"))
            {
                price = 1.35 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("peanuts"))
            {
                price = 1.55 * quantity;
                System.out.println(price);
            }
        }
        if(town.equalsIgnoreCase("plovdiv"))
        {
            if(product.equalsIgnoreCase("coffee"))
            {
                price = 0.40 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("water"))
            {
                price = 0.70 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("beer"))
            {
                price = 1.15 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("sweets"))
            {
                price = 1.30 * quantity;
                System.out.println(price);
            }
            if(product.equalsIgnoreCase("peanuts"))
            {
                price = 1.50 * quantity;
                System.out.println(price);
            }
        }


    }
}
