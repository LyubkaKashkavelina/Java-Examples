import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        double numbersUnder200 = 0;
        double numbersFrom200To399 = 0;
        double numbersFrom400To599 = 0;
        double numbersFrom600To799 = 0;
        double numbersOver800 = 0;
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;





        for (int i = 1;i<=count;i++)
        {
            int number = Integer.parseInt(scan.nextLine());

            if(number<200)
            {
                numbersUnder200++;
            }
            if(number>=200&&number<=399)
            {
                numbersFrom200To399++;
            }
            if(number>=400&&number<=599)
            {
                numbersFrom400To599++;
            }
            if(number>=600&&number<=799)
            {
                numbersFrom600To799++;
            }
            if(number>=800)
            {
                numbersOver800++;
            }

        }
        p1=numbersUnder200/count*100;
        System.out.printf("%.2f%%\n",p1);
        p2=numbersFrom200To399/count*100;
        System.out.printf("%.2f%%\n",p2);
        p3=numbersFrom400To599/count*100;
        System.out.printf("%.2f%%\n",p3);
        p4=numbersFrom600To799/count*100;
        System.out.printf("%.2f%%\n",p4);
        p5=numbersOver800/count*100;
        System.out.printf("%.2f%%\n",p5);
    }
}

