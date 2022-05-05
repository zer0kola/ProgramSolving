import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int[] score = new int[n];
            double sum =0;
            int upper =0;
            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                sum += score[j];
            }
            double avg = sum/n;
            for (int j = 0; j < n ; j++) {
                if (score[j]>avg) upper++;
            }
            double ratio = upper/(double)n*100;
            System.out.println(String.format("%.3f", ratio) + "%");
        }
    }
}