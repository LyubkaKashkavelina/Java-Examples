import java.util.Scanner;
import java.time.format.*;
import java.time.LocalDate;
public class DaysOnEarth  {

    public static void main(String[] agruments) {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String text = scan.nextLine();
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        LocalDate after1K = parsedDate.plusDays(999);
        System.out.printf("%1$td-%1$tm-%1$tY", after1K);

    }
}
