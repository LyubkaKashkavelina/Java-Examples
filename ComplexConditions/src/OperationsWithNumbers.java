import java.security.SecureRandom;
import java.util.Scanner;

public class OperationsWithNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
     int result;

        if(operator.equalsIgnoreCase("+"))
        {
            result = number1+number2;
            if(result%2==0)
            {
                System.out.println(number1 +" "  +  "+ "  +  number2 + " "  +  "="+ " "  +  result  +  " - even");
            }
            else {
                System.out.println(number1 +" "  +  "+ "  +  number2 + " "  +  "="+ " "  +  result  +  " - odd");
            }
        }
        else  if(operator.equalsIgnoreCase("-"))
        {
            result = number1-number2;
            if(result%2==0)
            {
                System.out.println(number1 +" "  +  "- "  +  number2 + " "  +  "="+ " "  +  result  +  " - even");
            }
            else {
                System.out.println(number1 +" "  +  "- "  +  number2 + " "  +  "="+ " "  +  result  +  " - odd");
            }
        }
        else if(operator.equalsIgnoreCase("*"))
        {
            result = number1*number2;
            if(result%2==0)
            {
                System.out.println(number1 +" "  +  "* "  +  number2 + " "  +  "="+ " "  +  result  +  " - even");
            }
            else {
                System.out.println(number1 +" "  +  "* "  +  number2 + " "  +  "="+ " "  +  result  +  " - odd");
            }
        }
        else if(operator.equalsIgnoreCase("/"))
        {

            if(number2==0)
            {
                System.out.println("Cannot divide "+number1+" by zero");
            }
            else {
                double result2 = (double)number1/(double)number2;
                System.out.printf("%d / %d = %.2f", number1,number2,result2);
            }
        }
        else if(operator.equalsIgnoreCase("%"))
        {

            if(number2==0)
            {

                System.out.println("Cannot divide "+number1+" by zero");
            }
            else {
                result = number1%number2;
                System.out.printf("%d %% %d = %d", number1,number2,result);
            }
        }
    }
}
