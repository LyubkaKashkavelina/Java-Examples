import java.util.Scanner;
        import java.text.DecimalFormat;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();



        if(input.equalsIgnoreCase("mm"))
        {
            number = number/1000;
        }
        else if(input.equalsIgnoreCase("cm"))
        {
            number = number/100;
        }
        else if(input.equalsIgnoreCase("mi"))
        {
            number = number/0.000621371192;
        }
        else if(input.equalsIgnoreCase("in"))
        {
            number = number/39.3700787;
        }
        else if(input.equalsIgnoreCase("km"))
        {
            number = number/0.001;
        }
        else if(input.equalsIgnoreCase("ft"))
        {
            number = number/3.2808399;
        }
        else if(input.equalsIgnoreCase("yd"))
        {
            number = number/1.0936133;
        }

        //System.out.println(number);
        if (output.equalsIgnoreCase("mm"))
        {
            number = number *1000;
        }
        else if(output.equalsIgnoreCase("cm"))
        {
            number = number*100;
        }
        else if(output.equalsIgnoreCase("mi"))
        {
            number = number*0.000621371192;
        }
        else if(output.equalsIgnoreCase("in"))
        {
            number = number*39.3700787;
        }
        else if(output.equalsIgnoreCase("km"))
        {
            number = number*0.001;
        }
        else if(output.equalsIgnoreCase("ft"))
        {
            number = number*3.2808399;
        }
        else if(output.equalsIgnoreCase("yd"))
        {
            number = number*1.0936133;
        }
        DecimalFormat df = new DecimalFormat("#.################");
        System.out.println(df.format(number) +" "+ output);
    }
}
