import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score:");
        int num = Integer.parseInt(scan.nextLine());
        double bonus = 0;
        double addBonus;

        if(num<=100)
        {
            bonus = 5;
        }
        else if(num > 100 && num<=1000)
        {
            bonus = num*0.2;
        }
        else if(num>1000)
        {
            bonus = num*0.1;
        }
        boolean even = (num%2==0);

            if (even) ;
            {
                addBonus = 1;
            }
            if (!even)
            {
                if(num%5==0)
                {
                    addBonus = 2;
                }
                else
                {
                    addBonus = 0;
                }


            }




        double totalBonus = bonus + addBonus;
        double totalResult = totalBonus + num;
        System.out.println("Bonus score: " + totalBonus);
        System.out.println("Total score: " + totalResult);

    }
}
