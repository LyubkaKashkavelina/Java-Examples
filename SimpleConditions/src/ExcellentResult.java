import java.util.Scanner;

/**
 * Created by toshiba1 on 13.7.2017 г..
 */
public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        if(grade >= 5.50)
        {
            System.out.println("Excellent!");
        }

    }
}
