import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int number = Integer.parseInt(scan.nextLine());

        for (int x1 = 0;x1<=9;x1++)
        {
            for (int x2 = 0;x2<=9;x2++)
            {
                for (int x3 = 0;x3<=9;x3++)
                {
                    for (int x4 = 0;x4<=9;x4++)
                    {
                        for (int x5 = 0;x5<=9;x5++)
                        {
                            for (int x6 = 0;x6<=9;x6++)
                            {
                                if(number==(x1*x2*x3*x4*x5*x6))
                                {
                                    System.out.printf("%d%d%d%d%d%d",x1,x2,x3,x4,x5,x6);
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                }
            }
        }
       // System.out.println(proizvedenie);
//        if(proizvedenie==number)
//        {
//            System.out.println(beginNumber);
//        }
//        else
//        {
//            beginNumber++;
//        }
    }
}
