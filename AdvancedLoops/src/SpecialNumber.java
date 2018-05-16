import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

//        for(int i = number;i>1;i--)
        //{
            for(int x1=1;x1<=9;x1++)
            {
                for (int x2=1;x2<=9;x2++)
                {
                    for (int x3=1;x3<=9;x3++)
                    {
                        for (int x4=1;x4<=9;x4++)
                        {
                            if(number%x1==0&&number%x2==0&&number%x3==0&&number%x4==0)
                            {
                                System.out.printf("%d%d%d%d",x1,x2,x3,x4);
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
        //}
    }
}
