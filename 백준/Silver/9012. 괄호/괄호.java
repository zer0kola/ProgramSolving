import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            Stack<Integer> stack = new Stack<>();
            String test = br.readLine();
            for (int j = 0; j < test.length(); j++) {
                if (test.charAt(j) == '(') {
                    stack.push(1);
                }
                else {
                    try {
                        stack.pop();
                    } catch (Exception e) {
                        stack.push(-1);
                        break;
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES"); // 정상적으로 완료되면 스택이 비어있음
            } else System.out.println("NO"); // 중간에 잘못되면 스택에 -1만 남아있음
        }
    }
}