import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a*b*c;
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        while (temp>0) {
            int x = temp%10;
            if (x == 0) arr[0] += 1;
            else if (x == 1) arr[1] += 1;
            else if (x == 2) arr[2] += 1;
            else if (x == 3) arr[3] += 1;
            else if (x == 4) arr[4] += 1;
            else if (x == 5) arr[5] += 1;
            else if (x == 6) arr[6] += 1;
            else if (x == 7) arr[7] += 1;
            else if (x == 8) arr[8] += 1;
            else arr[9] += 1;
            temp = temp/10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}