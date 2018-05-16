import java.util.Scanner;

public class VegetablesShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceVeg = Double.parseDouble(scan.nextLine());
        double priceFru = Double.parseDouble(scan.nextLine());
        int quantityVeg = Integer.parseInt(scan.nextLine());
        int quantityFru = Integer.parseInt(scan.nextLine());

        double sum = (priceVeg*quantityVeg)+(priceFru*quantityFru);
        double sumResult = sum / 1.94;

        System.out.printf("%f", sumResult);

    }
}
