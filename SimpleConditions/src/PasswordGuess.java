import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userPassword = scan.nextLine();
        String originalPassword = "s3cr3t!P@ssw0rd";

        if(userPassword.equalsIgnoreCase(originalPassword))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Wrong password!");
        }
    }
}
