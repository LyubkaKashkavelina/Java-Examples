import java.util.Scanner;

public class OnTimeForTheExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minutesOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrive = Integer.parseInt(scan.nextLine());
        int minutesOfArrive = Integer.parseInt(scan.nextLine());

        int actualHourOfExam = hourOfExam * 60 + minutesOfExam;
        int actualHourOfArrive = hourOfArrive * 60 + minutesOfArrive;

        if(hourOfArrive<=23&&hourOfExam<=23&&minutesOfArrive<=59&&minutesOfExam<=59) {


            if (actualHourOfArrive == actualHourOfExam) {
                System.out.println("On time");
            } else if (actualHourOfExam > actualHourOfArrive) {
                if ((actualHourOfExam - actualHourOfArrive) <= 30) {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", actualHourOfExam - actualHourOfArrive);
                } else if ((actualHourOfExam - actualHourOfArrive) > 30) {
                    System.out.println("Early");
                    if ((actualHourOfExam - actualHourOfArrive) <= 59) {
                        System.out.printf("%d minutes before the start", actualHourOfExam - actualHourOfArrive);
                    } else {
                        int countOfHours = (actualHourOfExam - actualHourOfArrive) / 60;
                        int countOfMinutes = (actualHourOfExam - actualHourOfArrive) % 60;
                        if (countOfMinutes < 10) {

                            System.out.printf("%d:0%d hours before the start", countOfHours, countOfMinutes);
                        } else {
                            System.out.printf("%d:%d hours before the start", countOfHours, countOfMinutes);
                        }
                    }


                }
            } else if (actualHourOfExam < actualHourOfArrive) {
                System.out.println("Late");
                if ((actualHourOfArrive - actualHourOfExam) <= 59) {

                    System.out.printf("%d minutes after the start", actualHourOfArrive - actualHourOfExam);
                } else {
                    int countOfHours = (actualHourOfArrive - actualHourOfExam) / 60;
                    int countOfMinutes = (actualHourOfArrive - actualHourOfExam) % 60;
                    if (countOfMinutes < 10) {

                        System.out.printf("%d:0%d hours after the start", countOfHours, countOfMinutes);
                    } else {
                        System.out.printf("%d:%d hours after the start", countOfHours, countOfMinutes);
                    }
                }

            }
        }
        else
        {
            System.out.println("Error");
        }

    }

}
