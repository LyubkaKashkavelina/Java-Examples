import java.util.Scanner;

public class NaiGolqmObshtDelitel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int mod = a%b;

        while (b != 0){
            int t = b;
            b = a%b;
            a = t;

        }
        System.out.println(a);
        }

}
