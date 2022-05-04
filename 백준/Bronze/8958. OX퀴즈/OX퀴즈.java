import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            String a = sc.next();
            char[] arr = a.toCharArray();
            int score = 0;
            int count = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == 'O') count++;
                else {
                    count = 0;
                }
                score += count;
            }
            System.out.println(score);
        }
    }
}