import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int size = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N ; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) stack.pop();
            else stack.push(a);
        }
        size = stack.size();
        for (int i = 0; i < size ; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}