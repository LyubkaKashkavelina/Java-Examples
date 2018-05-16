import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number != 0) {
            if (number < 100 || number > 200) {
                System.out.println("invalid");
            } else if (number < 0) {
                System.out.println("invalid");
            }
        }


    }

    }

