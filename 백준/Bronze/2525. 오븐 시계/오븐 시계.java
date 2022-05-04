import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        hour += time/60;
        min += time%60;
        if (min>59){
            min = min %60;
            hour++;
        }
        if (hour>23){
            hour = hour%24;
        }

        System.out.print(hour);
        System.out.print(" ");
        System.out.print(min);
    }


}