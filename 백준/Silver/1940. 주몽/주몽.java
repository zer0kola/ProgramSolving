import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 엔터로 받는 거니까 st 쓰지 말고 바로 받기
        int M = Integer.parseInt(br.readLine());
        int left = 0;
        int right = N - 1;
        int count = 0;
        int[] ing = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ing[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ing);
        while (left < right) {
            if (ing[left] + ing[right] > M) { // 재료 합이 크면 큰 값을 작게
                right--;
            } else if (ing[right] + ing[left] < M) { // 재료 합이 작으면 작은 값을 크게
                left++;
            } else {
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
