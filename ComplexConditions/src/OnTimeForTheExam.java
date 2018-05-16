import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minutesOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrive = Integer.parseInt(scan.nextLine());
        int minutesOfArrive = Integer.parseInt(scan.nextLine());
        int razlika = Math.abs(minutesOfArrive - minutesOfExam);
        int razlikaHours = Math.abs(hourOfArrive - hourOfExam);

        if (hourOfArrive == hourOfExam) {
            if (minutesOfArrive > minutesOfExam) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minutesOfArrive - minutesOfExam);
            } else if (minutesOfArrive < minutesOfExam) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minutesOfExam - minutesOfArrive);
            } else if (minutesOfArrive == minutesOfExam) {
                System.out.println("On time");
            }
        } else if (hourOfArrive > hourOfExam) {
            if ((minutesOfArrive - minutesOfExam) < 0) {
                System.out.println("Late");
                if ((hourOfArrive - hourOfExam - 1) == 0) {
                    System.out.printf("%d minutes after the start", (minutesOfArrive - minutesOfExam + 60));
                } else {
                    System.out.printf("%d:%d hours after the start", hourOfArrive - hourOfExam - 1, (minutesOfArrive - minutesOfExam + 60));
                }
            } else {
                System.out.println("Late");
                System.out.printf("%d:%d hours after the start", hourOfArrive - hourOfExam, Math.abs(minutesOfArrive - minutesOfExam));
            }
        } else if (hourOfArrive < hourOfExam) {

            if ((hourOfExam - hourOfArrive) == 1) {

                if (minutesOfArrive == minutesOfExam) {
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start", hourOfExam - hourOfArrive, Math.abs(minutesOfExam - minutesOfArrive));
                } else if (Math.abs(minutesOfArrive - minutesOfExam) <= 30) {
                    if(minutesOfExam<30){
                        System.out.println("On time");
                        System.out.printf("%d minutes before the start", Math.abs(minutesOfArrive - minutesOfExam));
                    }
                    else
                    {
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start", Math.abs(minutesOfArrive - minutesOfExam+10));
                    }
                } else if (Math.abs(minutesOfArrive - minutesOfExam) > 30) {
                    if(minutesOfExam<30){
                        System.out.println("On time");
                        System.out.printf("%d minutes before the start", Math.abs(minutesOfArrive - minutesOfExam));
                    }
                    else
                    {
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start", Math.abs(minutesOfArrive - minutesOfExam+10));
                    }

//                    System.out.println("On time");
//                    System.out.printf("%d minutes before the start", Math.abs(minutesOfArrive - minutesOfExam - 60));
                }

            } else

            {
                System.out.println("Early");
                System.out.printf("%d:%d hours before the start", hourOfExam - hourOfArrive, Math.abs(minutesOfExam - minutesOfArrive));
            }

        }
    }
}




