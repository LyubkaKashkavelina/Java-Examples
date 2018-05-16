import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if(input.equalsIgnoreCase("banana")||input.equalsIgnoreCase("apple")||input.equalsIgnoreCase("kiwi")||input.equalsIgnoreCase("cherry")||input.equalsIgnoreCase("lemon")||input.equalsIgnoreCase("grapes"))
        {
            System.out.println("fruit");
        }
        else if(input.equalsIgnoreCase("tomato")||input.equalsIgnoreCase("carrot")||input.equalsIgnoreCase("cucumber")||input.equalsIgnoreCase("pepper"))
        {
            System.out.println("vegetable");
        }
        else
        {
            System.out.println("unknown");
        }

    }
}
