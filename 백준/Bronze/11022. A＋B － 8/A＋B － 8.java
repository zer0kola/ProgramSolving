import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] arrA = new int[test];
        int[] arrB = new int[test];
        int[] arr = new int[test];
        for (int i = 0; i < test; i++) {
            arrA[i] = sc.nextInt();
            arrB[i] = sc.nextInt();
            arr[i] = arrA[i]+arrB[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Case #"+(i+1)+": "+arrA[i]+" + "+arrB[i]+" = "+arr[i]);
        }
    }
}