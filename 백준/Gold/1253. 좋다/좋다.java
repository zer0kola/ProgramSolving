import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 엔터로 받는 거니까 st 쓰지 말고 바로 받기
        int result = 0;
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        for (int current = 0; current < N; current++) {
            long find = arr[current];
            int left = 0;
            int right = arr.length-1;
            while (left < right) {
                if (arr[left] + arr[right] == find) {
                    // find는 서로 다른 두 수의 합이므로 같으면 안 셈
                    if (left != current && right != current) {
                        result++;
                        break;
                    } else if (left == current) {
                        left++;
                    } else if (right == current) {
                        right--;
                    }
                } else if (arr[left] + arr[right] < find) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }
}
