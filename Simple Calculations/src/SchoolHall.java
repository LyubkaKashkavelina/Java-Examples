import java.util.Scanner;

public class SchoolHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h = Double.parseDouble(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());

        double rows = ((h/120)*100);
        double bureau = (((w*100)-100)/70);
        int rowsInInt = (int)rows;
        int bureauInInt = (int)bureau;
        //System.out.println(rows);
        //System.out.println(bureau);

        int seats = (rowsInInt*bureauInInt)-3;
        System.out.println(seats);



    }
}
