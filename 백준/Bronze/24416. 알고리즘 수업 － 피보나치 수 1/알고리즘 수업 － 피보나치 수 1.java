import java.io.*;
import java.util.*;

public class Main {
    static int[] fib;
    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);
        System.out.print(count1+" ");
        System.out.print(count2);
    }
    static int fib(int n){
        if (n==1 || n ==2){
            count1++;
            return 1;
        }else{
            return (fib(n-1) + fib(n-2));
        }
    }
    static int fibonacci(int n){
        fib = new int[n+1];
        fib[0] = fib[1] = fib[2] = 1;
        for (int i = 3; i <= n ; i++) {
            count2++;
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}