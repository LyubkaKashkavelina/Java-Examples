import java.util.Scanner;

/**
 * Created by toshiba1 on 21.7.2017 г..
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 1;

        for(int row = 1;row<=n;row++)
        {
            for(int col = 0;col<row;col++)
            {

                if(count<=n){
                    System.out.print(count + " ");
                    count++;
                }

                else
                {
                    break;
                }

            }
            System.out.println();
        }
    }
}
