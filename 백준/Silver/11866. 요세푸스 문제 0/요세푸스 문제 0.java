import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n ; i++) {
            queue.add(i);
        }
        sb.append('<');
        while (queue.size()>1){
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
           sb.append(queue.poll()+", ");
        }
        sb.append(queue.poll()+">");
        System.out.println(sb);
    }
}