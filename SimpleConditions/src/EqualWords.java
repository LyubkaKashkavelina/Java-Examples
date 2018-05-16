import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstWord = scan.nextLine();
        String secondWord = scan.nextLine();

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        if(firstWord.equalsIgnoreCase(secondWord))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
