import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

       //for(int i = 0;i<2*n;i++)
        //{
            for(int i=0;i<n;i++)
            {
                int leftNumber = Integer.parseInt(scan.nextLine());
                sumLeft = sumLeft + leftNumber;
            }
            for(int i=0;i<n;i++)
            {
                int rightNumber = Integer.parseInt(scan.nextLine());
                sumRight = sumRight + rightNumber;
            }
            if(sumLeft==sumRight)
            {
                System.out.printf("Yes, sum = %d",sumLeft);
            }
            else
            {
                System.out.printf("No, diff = %d",Math.abs(sumLeft-sumRight));
            }
        //}
//    if(sumLeft==sumRight)
//    {
//        System.out.printf("Yes, sum = %d",sumLeft);
//    }
//    else
//    {
//        System.out.printf("No, dif = %d",Math.abs(sumLeft-sumRight));
//    }
    }

}

