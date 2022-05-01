import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ascArr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] desArr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        if (Arrays.equals(arr, ascArr)) System.out.println("ascending");
        else if (Arrays.equals(arr, desArr)) System.out.println("descending");
        else System.out.println("mixed");

    }
}