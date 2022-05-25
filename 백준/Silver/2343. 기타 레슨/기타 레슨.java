import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lecture = Integer.parseInt(st.nextToken());
        int[] lectures = new int[lecture];
        int bluWant = Integer.parseInt(st.nextToken());
        int start = Integer.MIN_VALUE;
        int end = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lecture; i++) {
            lectures[i] = Integer.parseInt(st.nextToken());
            start = Integer.max(lectures[i], start); // 가장 큰 값이 시작 인덱스
            end += lectures[i]; // 모든 값이 총합이 종료 인덱스
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int bluCount = 0;
            for (int i = 0; i < lecture; i++) {// mid 값으로 모든 값을 저장할 수 있는 지 확인
                if (sum + lectures[i] > mid) { // 저장하지 못하면 다음 블루레이에 저장
                    bluCount++;
                    sum = 0;
                }
                sum += lectures[i];
            }
            if (sum != 0) bluCount++; // 마지막 블루레이 
            if (bluCount > bluWant) start = mid + 1; // 원하는 개수보다 많으면 저장 용량을 늘림
            else end = mid - 1; // 원하는 개수보다 적거나 같으면 용량을 줄임
        }
        System.out.println(start); // start 값이 최소 용량?
    }
}