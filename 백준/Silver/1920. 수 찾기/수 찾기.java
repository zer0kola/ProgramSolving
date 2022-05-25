import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 이진 탐색은 정렬된 상태에서만 가능
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = arr.length-1;
            boolean find =false;
            while (start <= end){
                int midIndex = (start + end) /2; // 중간 인덱스
                int midValue = arr[midIndex];
                if (midValue < target){ // 중간 값이 타겟보다 작으면
                    start = midIndex + 1; // 범위 오른쪽으로 줄임
                }else if (midValue > target){ // 중간 값이 타겟보다 크면
                    end = midIndex -1; // 범위 왼쪽으로 줄임
                }else {
                    find = true;
                    break;
                }
            } // 찾으면 true
            if (find) {
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }

}