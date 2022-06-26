import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] fib = new long[92];
        fib[1] = 0;
        fib[2] = 1;
        for (int i = 3; i < 92 ; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(fib[n+1]);
    }
}
