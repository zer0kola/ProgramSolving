import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aX = sc.nextInt();
        int aY = sc.nextInt();
        int bX = sc.nextInt();
        int bY = sc.nextInt();
        int cX = sc.nextInt();
        int cY = sc.nextInt();
        int dX;
        int dY;
        if (aX==bX) dX =cX;
        else if (aX==cX) dX =bX;
        else dX=aX;
        if (aY==bY) dY =cY;
        else if (aY==cY) dY =bY;
        else dY=aY;
        System.out.print(dX);
        System.out.print(' ');
        System.out.print(dY);
    }
}