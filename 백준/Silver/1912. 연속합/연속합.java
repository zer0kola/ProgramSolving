import java.math.*;
import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static Integer[] sumArr;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        sumArr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sumArr[0] = arr[0];
        max = Math.max(arr[0], max);
        recur(n - 1);
        System.out.println(max);
    }
    static int recur(int n) {

        // 탐색하지 않은 인덱스라면
        if(sumArr[n] == null) {
            sumArr[n] = Math.max(recur(n - 1) + arr[n], arr[n]);

            // 해당 dp[N]과 max 중 큰 값으로 max 갱신
            max = Math.max(sumArr[n], max);
        }

        return sumArr[n];
    }
}