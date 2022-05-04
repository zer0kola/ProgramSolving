import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        int prize = 0;
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            prize = 10000 + arr[1] * 1000;
        } else if (arr[0] == arr[1]) {
            prize = 1000 + arr[0] * 100;
        } else if (arr[1] == arr[2]) {
            prize = 1000 + arr[1] * 100;
        } else if (arr[0] == arr[2]) {
            prize = 1000 + arr[2] * 100;
        } else {
            int max=0;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            prize = max*100;
        }
        System.out.println(prize);
    }

}