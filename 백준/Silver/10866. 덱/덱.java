import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (Objects.equals(order, "push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (Objects.equals(order, "push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (Objects.equals(order, "pop_front")) {
                if (deque.isEmpty()) bw.write("-1"+"\n");
                else bw.write(deque.pollFirst()+"\n");
            } else if (Objects.equals(order, "pop_back")) {
                if (deque.isEmpty()) bw.write("-1"+"\n");
                else bw.write(deque.pollLast()+"\n");
            } else if(Objects.equals(order,"size")){
                bw.write(deque.size()+"\n");
            } else if (Objects.equals(order, "empty")) {
                if(deque.isEmpty()) bw.write("1"+"\n");
                else bw.write("0"+"\n");
            } else if (Objects.equals(order, "front")) {
                if(deque.isEmpty()) bw.write("-1"+"\n");
                else bw.write(deque.peekFirst()+"\n");
            } else if (Objects.equals(order, "back")) {
                if(deque.isEmpty()) bw.write("-1"+"\n");
                else bw.write(deque.peekLast()+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}