import java.util.ArrayList;
import java.util.Scanner;

public class Boj10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==0 && b==0) break;
            arr.add(addNum(a,b));
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static int addNum(int a, int b) {
        return a+b;
    }
    }
