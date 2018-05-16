import java.util.Scanner;

public class NumberGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int specialNumber = Integer.parseInt(scan.nextLine());
        int controlNumber = Integer.parseInt(scan.nextLine());
       // int number = 100*firstNumber+10*secondNumber+thirdNumber;

//        System.out.println(number);

       // while(specialNumber<controlNumber) {


            //for (int i = number; i >= 111; i--) {
        for (int first = firstNumber;first>=1;first--) {
            for (int second = secondNumber;second>=1;second--)
            {
                for (int third = thirdNumber;third>=1;third--)
                {
                    int number = 100*first+10*second+third;

                    if (number % 3 == 0) {

                        //specialNumber = specialNumber + 5;
                        specialNumber+=5;

                    }
                    else if (number % 10 == 5) {

                        specialNumber -= 2;
                    }
                    else if (number % 2 == 0) {

                        specialNumber = specialNumber * 2;

                    }
                    if(specialNumber>=controlNumber)
                    {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.",specialNumber);
                        return;
                    }
                }
            }

        }


           // }
       // }


        System.out.printf("No! %d is the last reached special number.",specialNumber);


//        while(specialNumber<controlNumber)
//        {
//            for(int i = firstNumber;i<=9;)
//        }
    }
}
