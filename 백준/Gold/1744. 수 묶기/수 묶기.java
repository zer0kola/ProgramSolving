import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());// 양수는 큰 순서대로
        PriorityQueue<Integer> minusPq = new PriorityQueue<>(); // 음수는 작은 순서대로
        int oneCount = 0; // 1의 개수 (곱하나 마나 상관이 없어서)
        int zeroCount = 0; // 0의 개수
        for (int i = 0; i < N; i++) {
            int data = Integer.parseInt(br.readLine());
            if (data > 1) plusPq.add(data);
            else if (data == 1) oneCount++;
            else if (data == 0 ) zeroCount++;
            else minusPq.add(data);
        }
        int sum = 0;
        while(plusPq.size() > 1){ // 2개 이상 남았을 때
            int first = plusPq.poll();
            int second = plusPq.poll();
            sum += first*second;
        }
        if (!plusPq.isEmpty()) sum += plusPq.poll(); // 마지막 요소는 그냥 더해줌
        
        while(minusPq.size() > 1){
            int first = minusPq.poll();
            int second = minusPq.poll();
            sum += first*second;
        }
        if (!minusPq.isEmpty()) {
            if (zeroCount == 0) {
                sum += minusPq.poll();
            }
        }
        sum += oneCount;
        System.out.println(sum);
    }
}