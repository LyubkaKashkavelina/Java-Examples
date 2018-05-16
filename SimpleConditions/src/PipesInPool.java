import java.util.Scanner;
import java.text.DecimalFormat;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int volume = Integer.parseInt(scan.nextLine());
        int debitOfFirstPipe = Integer.parseInt(scan.nextLine());
        int debitOfSecondPipe = Integer.parseInt(scan.nextLine());
        double hours = Double.parseDouble(scan.nextLine());

        //double firstPipeSum = hours*debitOfFirstPipe;
        //double  secondPipeSum = hours*debitOfSecondPipe;
        double bothPipes = debitOfFirstPipe*hours + debitOfSecondPipe*hours;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
//        double percentage = 0;
//        double perOfFirstPIpe=0;
//        double perOfSecondPIpe=0;
//        //double overflow = 0;

//
//       if(obem<=0||obem>=10001)
//        {
//            System.out.println("Invalid volume!");
//
//        }
//        else if (debitOfFirstPipe <= 0 || debitOfFirstPipe >= 5001) {
//           System.out.println("Invalid debit!");
//       }
//            else if (debitOfSecondPipe <= 0 || debitOfSecondPipe >= 5001) {
//                   System.out.println("Invalid debit!");
//               } else if (hours <= 0 || hours >= 25) {
//                       System.out.println("Invalid hours!");
//                   } else {
        if (bothPipes <= volume) {
           int percentage = (int) (bothPipes / volume * 100);
            int perOfFirstPIpe = (int) (debitOfFirstPipe*hours/ bothPipes* 100);
            int perOfSecondPIpe =  (int) (debitOfSecondPipe*hours / bothPipes * 100);
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", percentage, perOfFirstPIpe, perOfSecondPIpe);
        }
        else
        {
            //overflow = bothPipes - volume;
            System.out.printf("For %s hours the pool overflows with %s liters.",decimalFormat.format(hours).replace(",", "."), bothPipes-volume);
        }
    }
}
//}


