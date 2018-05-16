import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine().toLowerCase();

        if(animal.equalsIgnoreCase("dog"))
        {
            System.out.println("mammal");
        }
        else if(animal.equalsIgnoreCase("snake")||animal.equalsIgnoreCase("crocodile")||animal.equalsIgnoreCase("tortoise"))
        {
            System.out.println("reptile");
        }
        else {
            System.out.println("unknown");
        }
    }



}
