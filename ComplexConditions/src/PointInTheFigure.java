import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        int x1=0;
        int y1=h;
        int x2=3*h;
        int y2=0;
        int x3=2*h;
        int y3=4*h;
        int x4=h;
        int y4=h;
        int bonusx1 = h;
        int bonusy1 = h;
        int bonusx2 = 2*h;
        int bonusy2 = h;



        ///System.out.printf("%d%d%d%d%d%d%d%d%d%d",x,x1,x2,x3,x4,y,y1,y2,y3,y4);

        if((x>x1&&x<x2&&y<y1&&y>y2)||(x<x3&&x>x4&&y<y3&&y>=y4)) {  //if((x>x1&&x<x2&&y<y1&&y>y2)||(x<x3&&x>x4&&y<y3&&y>y4))

            System.out.println("Inside");
        }


        else if (((((x==x1)||(x==x2))&&((y<=y1)&&(y>=y2)))||(((y==y1)||(y==y2))&&((x>=x1)&&(x<=x2))))||((((x==x3)||(x==x4))&&((y<=y3)&&(y>=y4)))||(((y==y3)||(y==y4))&&((x<=x3)&&(x>=x4)))))
        {
//            if(x>bonusx1&&x<bonusx2)
//            {
//                System.out.println("Inside");
//            }
            System.out.println("Border");
        }


        //System.out.println("Inside");
        else
        {
            System.out.println("Outside");
        }



    }
}
