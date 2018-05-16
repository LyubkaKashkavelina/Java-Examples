import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if(age>=16)
        {
            if(gender.equalsIgnoreCase("m"))
            {
                System.out.println("Mr.");
            }
            else if(gender.equalsIgnoreCase("f"))
            {
                System.out.println("Ms.");
            }
        }
        else
        {
            if(gender.equalsIgnoreCase("m"))
            {
                System.out.println("Master");
            }
            else if(gender.equalsIgnoreCase("f"))
            {
                System.out.println("Miss");
            }
        }

    }
}

