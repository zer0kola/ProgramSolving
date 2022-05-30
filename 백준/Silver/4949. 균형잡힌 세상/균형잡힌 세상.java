import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String test = br.readLine();
            if (Objects.equals(test, ".")) return;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < test.length(); i++) {
                char temp = test.charAt(i);
                if (test.charAt(i) == '(' || test.charAt((i)) == '[') {
                    stack.push(test.charAt(i));
                } else if (temp == ')' || temp == ']') {
                    if (stack.isEmpty() || (stack.peek() == '(' && temp == ']') || (stack.peek() == '[' && temp == ')')) {
                        // 스택이 비어있거나, 소괄호와 대괄호 순서가 맞지 않으면 false
                        stack.push(temp);
                        break;
                    } else stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes"); // 정상적으로 완료되면 스택이 비어있음
            } else System.out.println("no"); // 중간에 잘못되면 스택에 남아있음

        }
    }
}