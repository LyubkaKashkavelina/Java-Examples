import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine().toLowerCase();
        Double volumeSales = Double.parseDouble(scan.nextLine());
        Double comission = -1.0;

        if(town.equalsIgnoreCase("sofia"))
        {
            if(volumeSales>=0&&volumeSales<=500)
            {
                comission = 0.05;
            }
            else if(volumeSales>500&&volumeSales<=1000)
            {
                comission = 0.07;
            }
            else if(volumeSales>1000&&volumeSales<=10000)
            {
                comission = 0.08;
            }
            else if(volumeSales>10000)
            {
                comission = 0.12;
            }
            else {
                System.out.println("error");
            }
        }
        else if(town.equalsIgnoreCase("varna"))
        {
            if(volumeSales>=0&&volumeSales<=500)
            {
                comission = 0.045;
            }
            else if(volumeSales>500&&volumeSales<=1000)
            {
                comission = 0.075;
            }
            else if(volumeSales>1000&&volumeSales<=10000)
            {
                comission = 0.10;
            }
            else if(volumeSales>10000)
            {
                comission = 0.13;
            }
            else {
                System.out.println("error");
            }
        }

        else if(town.equalsIgnoreCase("plovdiv"))
        {
            if(volumeSales>=0&&volumeSales<=500)
            {
                comission = 0.055;
            }
            else if(volumeSales>500&&volumeSales<=1000)
            {
                comission = 0.08;
            }
            else if(volumeSales>1000&&volumeSales<=10000)
            {
                comission = 0.12;
            }
            else if(volumeSales>10000)
            {
                comission = 0.145;
            }
            else {
                System.out.println("error");
            }
        }
        else
        {
            System.out.println("error");
        }
        System.out.printf("%.2f",volumeSales*comission);

    }
}
