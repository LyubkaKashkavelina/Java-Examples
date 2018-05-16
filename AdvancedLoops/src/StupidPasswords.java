import javafx.util.converter.CharacterStringConverter;

import java.util.Scanner;

public class StupidPasswords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int c = 97;
        int d = 97;

        for(int i = 1;i<n;i++)
        {
            for(int j = 1;j<n;j++)
            {
                //System.out.print(j);
                for (int a = 0;a<l;a++)
                {
//                    String s = Character.toString((char) (a+c));
//                    System.out.print(s);
                    for (int b = 0;b<l;b++)
                    {
//                        String m = Character.toString((char) (b+d));
//                        System.out.print(m);

                        for(int k = Math.max(i,j)+1;k<=n;k++)
                        {
                            System.out.print(i);
                            System.out.print(j);
                            String s = Character.toString((char) (a+c));
                            System.out.print(s);
                            String m = Character.toString((char) (b+d));
                            System.out.print(m);
                            System.out.print(k);
                            System.out.print(" ");

                        }
                    }
                }
            }



//            System.out.print(" ");
        }
    }
}
