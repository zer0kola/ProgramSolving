import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        String in = sc.nextLine();
        sc.close();
        int[] arr = new int[test];

        for (int i=0; i < in.length(); i++) {
            arr[i] = in.charAt(i)-'0';
        }
        int sum = 0;
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}