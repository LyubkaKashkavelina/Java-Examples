import java.util.Scanner;

public class ControlNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int controlNumber = Integer.parseInt(scan.nextLine());

        int count = 0;
        int sum = 0;

        for(int first = 1;first<=N;first++)
        {
            for (int second = M;second>=1;second--)
            {
                count++;
                sum = sum + first*2 + second*3;
                if(sum>=controlNumber)
                {
                    System.out.printf("%d moves\n",count);
                    System.out.printf("Score: %d >= %d",sum,controlNumber);
                    return;
                }
//                else
//                {
//                    System.out.printf("%d moves",count);
//                }


            }
        }
        System.out.printf("%d moves",count);
    }

}
