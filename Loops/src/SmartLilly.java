import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int years = Integer.parseInt(scan.nextLine());
        double priceWashingMachine = Double.parseDouble(scan.nextLine());
        int priceOfToy = Integer.parseInt(scan.nextLine());
        int numberToys = 0;
        double sumForBirthdays = 0.0;
        double fundsFromToys = 0.0;
        double totalSum = 0.0;
        double numberOfEvenBirthdays = 0.0;

        for(int i = 1;i<=years;i++)
        {
            if(i%2==0)
            {
                numberOfEvenBirthdays++;
                sumForBirthdays = sumForBirthdays + (numberOfEvenBirthdays*10);

            }
            else
            {
                numberToys++;
            }
        }

        fundsFromToys=numberToys*priceOfToy;
        totalSum = sumForBirthdays + fundsFromToys-(numberOfEvenBirthdays*1.00);
        if(totalSum>=priceWashingMachine)
        {
            System.out.printf("Yes! %.2f",totalSum-priceWashingMachine);
        }
        else
        {
            System.out.printf("No! %.2f",priceWashingMachine-totalSum);
        }

    }
}
