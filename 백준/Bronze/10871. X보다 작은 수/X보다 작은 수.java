import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] input = new int[n];
        ArrayList result = new ArrayList<>();
        for (int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }
        for (int i= 0; i<n;i++){
            if(input[i]<x){
                result.add(input[i]);
            }
        }
        for (int i = 0; i< result.size(); i++) {
            System.out.print(result.get(i));
            System.out.print(' ');
        }
    }
}