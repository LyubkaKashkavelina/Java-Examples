import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstPlayer = Integer.parseInt(scan.nextLine());
        int secondPlayer = Integer.parseInt(scan.nextLine());
        int thirdPlayer = Integer.parseInt(scan.nextLine());
        double sum = firstPlayer + secondPlayer + thirdPlayer;


        if(sum >= 0 && sum<= 59)
        {
                if (sum<10){

                    System.out.println("0:" + "0" + (int)sum);

                }
                else {
                    System.out.println("0:" + (int) sum);

                }
        }
        if(sum>=60 && sum<=119)
        {
            if ((sum-60)<10){

                System.out.println("1:" + "0" + (int)(sum-60));

            }
                else {
                System.out.println("1:" + (int)(sum-60));
            }


        }
        if(sum>=120 && sum<=179)
        {
            if ((sum-120)<10){

                System.out.println("2:" + "0" + (int)(sum-120));

            }
            else {
                System.out.println("2:" + (int) (sum - 120));
            }

        }




    }
}
