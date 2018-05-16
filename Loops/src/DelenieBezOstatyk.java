import java.util.Scanner;

public class DelenieBezOstatyk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        double divide2 = 0.0;
        double divide3 = 0.0;
        double divide4 = 0.0;
        double p1 =0.0;
        double p2 =0.0;
        double p3 =0.0;

        for(int i = 1;i<=count;i++)
        {
            int number = Integer.parseInt(scan.nextLine());
            if(number%2==0)
            {
                divide2++;
            }
            if(number%3==0)
            {
                divide3++;
            }
            if(number%4==0)
            {
                divide4++;
            }
        }

        p1=divide2/count*100;
        System.out.printf("%.2f%%\n",p1);
        p2=divide3/count*100;
        System.out.printf("%.2f%%\n",p2);
        p3=divide4/count*100;
        System.out.printf("%.2f%%\n",p3);


    }
}
