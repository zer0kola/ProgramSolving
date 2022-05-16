import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] sumArr = new long[n+1];
        // 한 칸 더 많이 선언해서 간편하게 하기 위함
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) { // sumArr[0]은 어차피 0으로 초기화
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
            //sumArr[1]부터 배열이 시작한다고 생각하면 됨
        }
        for (int k = 0; k < m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[j]-sumArr[i-1]);
        }
    }
}