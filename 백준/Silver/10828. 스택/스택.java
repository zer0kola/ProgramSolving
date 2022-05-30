import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (Objects.equals(order, "push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (Objects.equals(order, "pop")) {
                if (stack.isEmpty()) System.out.println("-1");
                else System.out.println(stack.pop());
            } else if (Objects.equals(order, "top")) {
                if (stack.isEmpty()) System.out.println("-1");
                else System.out.println(stack.peek());
            } else if (Objects.equals(order, "size")) {
                System.out.println(stack.size());
            } else {
                if (stack.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }
        }
    }
}