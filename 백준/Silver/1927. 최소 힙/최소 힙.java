import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                if(pQueue.isEmpty()) System.out.println('0');
                else System.out.println(pQueue.poll());
            } else pQueue.add(num);
        }
    }
}