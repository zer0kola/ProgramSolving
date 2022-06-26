import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int day = 0;
        switch (x){
            case 1: day += 0; break;
            case 2: day += 31; break;
            case 3: day += 59; break;
            case 4: day += 90; break;
            case 5: day += 120; break;
            case 6: day += 151; break;
            case 7: day += 181; break;
            case 8: day += 212; break;
            case 9: day += 243; break;
            case 10: day += 273; break;
            case 11: day += 304; break;
            case 12: day += 334; break;
        }
        day += y;
        day = day%7;
        switch (day){
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 0:
                System.out.println("SUN");
                break;
        }
    }
}
