import java.util.Scanner;

/**
 * Created by toshiba1 on 26.7.2017 г..
 */
public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfTries = Integer.parseInt(scan.nextLine());
        double result = 0.0;
        int counter09 = 0;
        int counter1019 = 0;
        int counter2029 = 0;
        int counter3039 = 0;
        int counter4050 = 0;
        int counterInvalid = 0;


        for(int i = 1;i<=numberOfTries;i++)
        {
            int number = Integer.parseInt(scan.nextLine());

            if(number>=0&&number<=9)
            {
                result = result + number*20.0/100.0;
                counter09++;

            }
            else if(number>=10&&number<=19)
            {
                result = result + number*30.0/100.0;
                counter1019++;
            }
            else if(number>=20&&number<=29)
            {
                result = result + number*40.0/100.0;
                counter2029++;
            }
            else if(number>=30&&number<=39)
            {
                result = result + 50;
                counter3039++;
            }
            else if(number>=40&&number<=50)
            {
                result = result + 100;
                counter4050++;
            }
            else if(number<0||number>50)
            {
                result = result/2;
                counterInvalid++;
            }



        }
        System.out.printf("%.2f\n",result);
        System.out.printf("From 0 to 9: %.2f%%\n",(double)counter09/numberOfTries*100);
        System.out.printf("From 10 to 19: %.2f%%\n",(double)counter1019/numberOfTries*100);
        System.out.printf("From 20 to 29: %.2f%%\n",(double)counter2029/numberOfTries*100);
        System.out.printf("From 30 to 39: %.2f%%\n",(double)counter3039/numberOfTries*100);
        System.out.printf("From 40 to 50: %.2f%%\n",(double)counter4050/numberOfTries*100);
        System.out.printf("Invalid numbers: %.2f%%\n",(double)counterInvalid/numberOfTries*100);

    }
}
