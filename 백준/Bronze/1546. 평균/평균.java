import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] origin = new int[test];
        double[] score = new double[test];
        double sum=0;
        for (int i = 0; i < test; i++) {
            origin[i] = sc.nextInt();
        }
        Arrays.sort(origin);
        int max = origin[origin.length-1];
        for (int i = 0; i < test; i++) {
            score[i] = (double) origin[i]/max*100;
        }
        for (int i = 0; i < test ; i++) {
            sum+= score[i];
        }
        System.out.println(sum/test);
    }
}