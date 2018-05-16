import java.util.Scanner;

public class WorkHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int neededHours = Integer.parseInt(scan.nextLine());
        int numberOfWorkers = Integer.parseInt(scan.nextLine());
        int workDays = Integer.parseInt(scan.nextLine());

        int workHours = workDays*8;

        int time = numberOfWorkers*workHours;

        if(time>=neededHours)
        {
            System.out.printf("%d hours left",time-neededHours);
        }
        else
        {
            System.out.printf("%d overtime\n",neededHours-time);
            System.out.printf("Penalties: %d",(neededHours-time)*workDays);
        }

    }
}
