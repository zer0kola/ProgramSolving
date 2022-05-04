import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] arr = new int[test];
        for (int i = 0; i < test; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a+b;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Case #"+(i+1)+": "+arr[i]);
        }
    }
}
