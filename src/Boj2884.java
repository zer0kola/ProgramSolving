import java.util.Scanner;

public class Boj2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if (min>=45){
            System.out.print(hour);
            System.out.print(' ');
            System.out.print(min -45);
        }else if (hour != 0){
            System.out.print(hour-1);
            System.out.print(' ');
            System.out.print(min+15);
        }else{
            System.out.print(23);
            System.out.print(' ');
            System.out.print(min+15);
        }
    }
}
