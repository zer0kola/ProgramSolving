import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Integer.min(min, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("-1");
            return;
        }
        System.out.println(sum);
        System.out.println(min);

    }

    static boolean isPrime(int n) {
        if (n==1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}