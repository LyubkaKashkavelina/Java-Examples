import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int newMinutes = minutes + 15;


      if(hours>=0&&hours<=22)
      {
        if(newMinutes>59)
        {
            hours = hours + 1;
            if((newMinutes-60)<10) {
                System.out.printf("%d:0%d", hours, newMinutes - 60);
            }
            else
            {
                System.out.printf("%d:%d", hours, newMinutes - 60);
            }

        }
        else
        {
            System.out.printf("%d:%d", hours, newMinutes);
        }
      }
      else if(hours==23)
      {
          if(minutes>=45)
          {
              int newHour = hours - 23;
              if((newMinutes-60)<10) {
                  System.out.printf("%d:0%d", newHour, newMinutes - 60);
              }
              else
              {
                  System.out.printf("%d:%d", newHour, newMinutes - 60);
              }
          }
          else
          {
              System.out.printf("%d:%d",hours,newMinutes);
          }
      }
      else
      {
          System.out.println("invalid hour");
      }
    }
}
