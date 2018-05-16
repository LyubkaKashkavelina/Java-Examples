
public class RectangleOf10x10Stars {
    public static void main(String[] args) {
        for(int i =0;i<10;i++)
        {
            System.out.println(repeatStr("*", 10));
        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {

            text = text + strToRepeat;
        }

        return text;
    }
}