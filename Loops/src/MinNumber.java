import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;

        for(int i =0;i<n;i++)
        {
            int number = Integer.parseInt(scan.nextLine());
            if(number<min)
            {
                min=number;
            }
        }
        System.out.println(min);
    }

}
