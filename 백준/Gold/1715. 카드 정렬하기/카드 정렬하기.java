import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();// 우선순위 큐
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int data1 = 0;
        int data2 = 0;
        int sum = 0;
        // 가장 작은 값 2개를 계속 더하면 됨
        while (pq.size() != 1) { // 값이 하나만 남을 때까지
            data1 = pq.remove(); // 자동으로 제일 작은 값 반환
            data2 = pq.remove(); // 자동으로 두번째로 작은 값 반환
            sum += data1 + data2;
            pq.add(data1 + data2); // sum을 넣으면 알아서 정렬
        }
        System.out.println(sum);
    }
}