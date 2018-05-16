import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lev = 1.0;
        double dollar = 1.79549;
        double euro = 1.95583;
        double pound = 2.53405;
        double newValue = 0;
        double value = Double.parseDouble(scan.nextLine());
        String enterCurrency = scan.nextLine();
        String outputCurrency = scan.nextLine();

        switch(enterCurrency){

            case "BGN":
                    break;
            case "USD":
                value = (value*dollar);
                break;
            case "EUR":
                value = (value*euro);
                break;
            case "GBP":
                value = (value*pound);
                break;

        }

        switch (outputCurrency){

            case "BGN":
                value = (value/lev);
                break;
            case "USD":
                value = (value/dollar);
                break;
            case "EUR":
                value = (value/euro);
                break;
            case "GBP":
                value = (value/pound);
                break;

        }

        System.out.printf("%.2f",value);




    }

}
