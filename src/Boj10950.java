import java.util.ArrayList;
import java.util.Scanner;

public class Boj10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(addNum(a,b));
        }
        for (int i = 0; i < test; i++) {
            System.out.println(arr.get(i));
        }
    }

    public static int addNum(int a, int b) {
        return a+b;
    }
}
