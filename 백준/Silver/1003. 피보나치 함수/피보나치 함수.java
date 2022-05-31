import java.io.*;
import java.util.*;

public class Main {
    static int zeroCount;
    static int oneCount;
    static int zeroPlusOneCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(zeroCount).append(' ').append(oneCount).append('\n');
        }
        System.out.println(sb);
    }

    static void fibonacci(int n) {
        zeroCount = 1;
        oneCount = 0;
        zeroPlusOneCount = 1;
        for (int i = 0; i < n; i++) {
            zeroCount = oneCount;
            oneCount = zeroPlusOneCount;
            zeroPlusOneCount = zeroCount + oneCount;
        }
        //1. N에 대한 0호출 횟수 = N-1의 1 호출 횟수
        //2. N에 대한 1 호출 횟수 = N-1의 0 호출 횟수 + N-1의 1 호출 횟수
    }

}