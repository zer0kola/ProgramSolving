import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int last = 0;
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (Objects.equals(order, "push")) {
                last = Integer.parseInt(st.nextToken());
                queue.add(last);
            } else if (Objects.equals(order, "pop")) {
                if (queue.isEmpty()) bw.write("-1"+"\n");
                else bw.write(queue.poll()+"\n");
            } else if (Objects.equals(order, "front")) {
                if (queue.isEmpty()) bw.write("-1"+"\n");
                else bw.write(queue.peek()+"\n");
            } else if (Objects.equals(order, "size")) {
                bw.write(queue.size()+"\n");
            } else if(Objects.equals(order,"back")){
                if (queue.isEmpty()) bw.write("-1"+"\n");
                else bw.write(last+"\n");
            } else {
                if (queue.isEmpty()) bw.write("1"+"\n");
                else bw.write("0"+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}